package cs425.miu.MyStudentMgmtApp.repository;

import cs425.miu.MyStudentMgmtApp.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface StudentRepository extends JpaRepository<Student,Long> {
}
