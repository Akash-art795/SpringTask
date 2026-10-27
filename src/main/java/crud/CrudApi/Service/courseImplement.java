package crud.CrudApi.Service;

import crud.CrudApi.Repository.courseRepository;
import crud.CrudApi.dao.courseDAO;
import crud.CrudApi.model.courseModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class courseImplement implements courseService{
    @Autowired
    private courseRepository repo; //this contains the query logics for our database
    @Override
    public String courseAddLogics(courseDAO d){
        courseModel saveData = new courseModel(d.getStudentName(),d.getPhoneno(),d.getCourseId(),d.getCourseName(),d.getCourseDuration(),d.getCourseTime());
        repo.save(saveData);
        return "Data Stored Successfully";
    }
    public ArrayList<courseDAO> display(){
        List<courseModel> getdata = repo.findAll();
        ArrayList<courseDAO> transfer = new ArrayList<>();
        for(courseModel getdataall : getdata){
            courseDAO set = new courseDAO();
            set.setStudentid(getdataall.getStudentid());
            set.setStudentName(getdataall.getStudentName());
            set.setPhoneno(getdataall.getPhoneno());
            set.setCourseId(getdataall.getCourseId());
            set.setCourseName(getdataall.getCourseName());
            set.setCourseDuration(getdataall.getCourseDuration());
            set.setCourseTime(getdataall.getCourseTime());
            transfer.add(set);
        }
        return transfer;
    }

    @Override
    public String updateLogics(courseDAO c){
        Optional <courseModel> model = repo.findById(c.getStudentid());
        if(model.isPresent()){
            courseModel saveUpdate = model.get();
            saveUpdate.setStudentName(c.getStudentName());
            saveUpdate.setPhoneno(c.getPhoneno());
            saveUpdate.setCourseId(c.getCourseId());
            saveUpdate.setCourseName(c.getCourseName());
            saveUpdate.setCourseTime(c.getCourseTime());
            saveUpdate.setCourseDuration(c.getCourseDuration());
            repo.save(saveUpdate);
            return "Student Data Updated Successfully...";
        }
        else{
            return "Student Data Updation Failed";
        }
    }
    public String deleteLogics(int studentid){
        Optional <courseModel> model = repo.findById(studentid); //select * from courseTable where studentid = ?
        if(model.isPresent()){
            repo.deleteByStudentid(studentid); //delete * from courseTable where studentid = ?
            return "Student-Id: "+studentid+" Deleted Successfully...";
        }
        else{
            return "StudentId Deletion failed...";
        }
    }
}
