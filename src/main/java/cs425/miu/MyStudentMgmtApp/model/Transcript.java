package cs425.miu.MyStudentMgmtApp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="transcript")
public class Transcript {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long transcriptId;
    private String degreeTitle;

    //dependency
    @OneToOne(mappedBy = "transcript")
    private Student student;


}
