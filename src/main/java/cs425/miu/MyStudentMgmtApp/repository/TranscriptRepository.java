package cs425.miu.MyStudentMgmtApp.repository;

import cs425.miu.MyStudentMgmtApp.model.Transcript;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface TranscriptRepository extends JpaRepository<Transcript,Long> {
}
