package cs425.miu.MyStudentMgmtApp.service.impl;

import cs425.miu.MyStudentMgmtApp.model.Classroom;
import cs425.miu.MyStudentMgmtApp.repository.ClassroomRepository;
import cs425.miu.MyStudentMgmtApp.service.ClassroomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class ClassroomServiceImpl implements ClassroomService {
    @Autowired
    private ClassroomRepository classroomRepository;
    @Override
    public Classroom addNewClassroom(Classroom classroom) {
        var classrooms = classroomRepository.save(classroom);
        return classrooms;
    }

    @Override
    public List<Classroom> getAllClassroom() {
        var classrooms = classroomRepository.findAll();
        return classrooms;
    }

    @Override
    public void deleteClassroom(Long classroomId) {
        classroomRepository.deleteById(classroomId);
    }
}
