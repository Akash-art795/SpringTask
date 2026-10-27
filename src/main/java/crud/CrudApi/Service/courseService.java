package crud.CrudApi.Service;

import crud.CrudApi.dao.courseDAO;

import java.util.List;

public interface courseService {
    public String courseAddLogics(courseDAO d);
    public List<courseDAO> display();
    public String updateLogics(courseDAO c);
    public String deleteLogics(int studentid);
}