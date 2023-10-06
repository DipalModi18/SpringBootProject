package com.learning.springbootproject;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {

    @RequestMapping("/courses")
    public List<Course> retrieveAllCourses() {
        return Arrays.asList(
                new Course(1, "Learn Java", "xyz"),
                new Course(2, "Learn Spring", "xyz"),
                new Course(3, "Learn Spring", "xyz"),
                new Course(4, "Learn Spring", "xyz"),
                new Course(5, "Learn Spring", "xyz")
        );
    }
}
