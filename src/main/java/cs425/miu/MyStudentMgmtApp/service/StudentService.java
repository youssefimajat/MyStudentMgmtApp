package cs425.miu.MyStudentMgmtApp.service;

import cs425.miu.MyStudentMgmtApp.model.Student;

import java.util.List;

public interface StudentService {
    public abstract Student addNewStudent(Student student);
    public abstract List<Student> getAllStudent();
    public abstract Student getStudentById(Long studentId);
    public Student updateStudent(Student updateStudent);
    public void deleteStudent(Long studentId);
}
