package cs425.miu.MyStudentMgmtApp.service;

import cs425.miu.MyStudentMgmtApp.model.Course;

public interface CourseService {
    public abstract Course addNewCourse(Course course);
    public Course updateCourse(Course updatedCourse);
}
