package cs425.miu.MyStudentMgmtApp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long studentId;
    private String studentNumber;
    private  String firstName;
    private String middleName;
    private String LastName;
    private double cgpa;
    private Date dateOfEnrollment;
    //dependecy onetoone
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "trans_stud_id",nullable = true)
    private Transcript transcript;

    @ManyToOne
    @JoinColumn(name = "StudentClassroo",nullable = true)
    private Classroom classroom;

    @ManyToMany
    @JoinTable(
            name = "Student_course",
            joinColumns = {@JoinColumn(name = "student_id",referencedColumnName = "studentId")},
            inverseJoinColumns = {@JoinColumn(name = "course_id",referencedColumnName = "classroomId")}
    )
    private List<Course> course ;

}
