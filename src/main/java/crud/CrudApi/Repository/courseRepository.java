package crud.CrudApi.Repository;

import crud.CrudApi.model.courseModel;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface courseRepository extends JpaRepository<courseModel,Integer> {
    @Transactional
    void deleteByStudentid(int studentid); //delete from courseTable where Studendentid = ?
}
