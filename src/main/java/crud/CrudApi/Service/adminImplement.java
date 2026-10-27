package crud.CrudApi.Service;


import crud.CrudApi.Repository.adminRepository;
import crud.CrudApi.dao.adminDTO;
import crud.CrudApi.model.adminModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class adminImplement implements adminService{
    @Autowired
    private adminRepository repo;

    public String adminAddLogics(adminDTO a){
        adminModel saveData = new adminModel(a.getAdminId(),a.getAdminName(),a.getPassword());
        repo.save(saveData);
        return "Admin Data Registered Successfully...";
    }
    public ArrayList<adminDTO> display(){
        List<adminModel> getdata = repo.findAll();
        ArrayList<adminDTO> transfer = new ArrayList<>();
        for(adminModel g : getdata){
            adminDTO set = new adminDTO();
            set.setSerialNo(g.getSerialNo());
            set.setAdminId(g.getAdminId());
            set.setAdminName(g.getAdminName());
            set.setPassword(g.getPassword());
            transfer.add(set);
        }
        return transfer;
    }
    public boolean login(adminDTO a){
        Optional<adminModel> check = repo.findByIdAndPassword(a.getAdminId(),a.getPassword());
        return check.isPresent();
    }
}
