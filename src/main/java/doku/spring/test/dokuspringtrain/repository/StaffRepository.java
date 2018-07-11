package doku.spring.test.dokuspringtrain.repository;

import doku.spring.test.dokuspringtrain.entity.Staff;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface StaffRepository extends JpaRepository<Staff,Integer> {
}
