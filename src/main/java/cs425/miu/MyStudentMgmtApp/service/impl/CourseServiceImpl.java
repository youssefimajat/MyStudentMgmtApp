package cs425.miu.MyStudentMgmtApp.service.impl;

import cs425.miu.MyStudentMgmtApp.model.Course;
import cs425.miu.MyStudentMgmtApp.repository.CourseRepository;
import cs425.miu.MyStudentMgmtApp.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class CourseServiceImpl implements CourseService {
    @Autowired
    private CourseRepository courseRepository;
    @Override
    public Course addNewCourse(Course course) {
        var AddedCourse = courseRepository.save(course);
        return AddedCourse ;
    }

    @Override
    public Course updateCourse(Course updatedCourse) {
        return courseRepository.save(updatedCourse);
    }
}
