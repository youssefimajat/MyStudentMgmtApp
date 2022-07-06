package cs425.miu.MyStudentMgmtApp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="classroom")
public class Classroom {
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private long classroomId;
     private String buildingNamel;

     @OneToMany(mappedBy = "classroom")
     private List<Student> studentList;



}
