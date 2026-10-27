package crud.CrudApi.Controller;

import crud.CrudApi.Service.courseService;
import crud.CrudApi.dao.courseDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/courseApi")
public class courseController {
    @Autowired
    private courseService service;

    @PostMapping("/addCourse")
    public String courseAPI (@RequestBody courseDAO d){
        return service.courseAddLogics(d);
    }

    @GetMapping("/courseDetails")
    public List<courseDAO> display(){
        return service.display();
    }

    @PutMapping("/courseUpdate")
    public ResponseEntity<String>updateApi(@RequestBody courseDAO c){
        String response = service.updateLogics(c);
        return ResponseEntity.ok(response);
    }
    @DeleteMapping("/studentDelete/{studentid}")
    public ResponseEntity<String>deleteApi(@PathVariable(name = "studentid") int studentid){
        String response = service.deleteLogics(studentid);
        return ResponseEntity.ok(response);
    }


}
