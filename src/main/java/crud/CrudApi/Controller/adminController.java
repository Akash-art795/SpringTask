package crud.CrudApi.Controller;

import crud.CrudApi.Service.adminService;
import crud.CrudApi.dao.adminDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/adminApi")
public class adminController {
    @Autowired
    public adminService service;

    @PostMapping("/addAdmin")
    public String admin(@RequestBody adminDTO a){
        return service.adminAddLogics(a);
    }

    @GetMapping("/adminDetails")
    public List<adminDTO> admindet(){
        return service.display();
    }
//    @PostMapping("login")
//    public R

}
