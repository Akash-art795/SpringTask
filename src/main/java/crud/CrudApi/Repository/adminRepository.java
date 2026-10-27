package crud.CrudApi.Repository;

import crud.CrudApi.model.adminModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface adminRepository extends JpaRepository<adminModel,Integer> {
    Optional<adminModel> findByIdAndPassword(int adminId , String password);
}
