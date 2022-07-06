package cs425.miu.MyStudentMgmtApp.repository;

import cs425.miu.MyStudentMgmtApp.model.Classroom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassroomRepository extends JpaRepository<Classroom,Long> {
}
