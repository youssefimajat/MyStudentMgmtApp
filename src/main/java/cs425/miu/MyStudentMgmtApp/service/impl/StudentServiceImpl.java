package cs425.miu.MyStudentMgmtApp.service.impl;

import cs425.miu.MyStudentMgmtApp.model.Student;
import cs425.miu.MyStudentMgmtApp.repository.StudentRepository;
import cs425.miu.MyStudentMgmtApp.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student addNewStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public List<Student> getAllStudent() {
        var students = studentRepository.findAll();
        return students;
    }

    @Override
    public Student getStudentById(Long studentId) {
        return studentRepository.findById(studentId).orElse(null);
    }

    @Override
    public Student updateStudent(Student updateStudent) {
        return studentRepository.save(updateStudent);
    }

    @Override
    public void deleteStudent(Long studentId) {
    studentRepository.deleteById(studentId);
    }
}
