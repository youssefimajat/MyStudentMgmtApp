package cs425.miu.MyStudentMgmtApp.service;

import cs425.miu.MyStudentMgmtApp.model.Classroom;
import cs425.miu.MyStudentMgmtApp.model.Student;

import java.util.List;

public interface ClassroomService {
    public abstract Classroom addNewClassroom(Classroom classroom);
    public abstract List<Classroom> getAllClassroom();
    public void deleteClassroom(Long classroomId);
}
