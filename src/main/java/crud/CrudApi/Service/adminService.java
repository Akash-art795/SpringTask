package crud.CrudApi.Service;

import crud.CrudApi.dao.adminDTO;

import java.util.List;

public interface adminService {
    public String adminAddLogics(adminDTO a);
    public List<adminDTO> display();
    public boolean login(adminDTO a);
}
