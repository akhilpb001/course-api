package io.javabrains.springbootquickstart.courseapi.course;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.javabrains.springbootquickstart.courseapi.topic.Topic;

@Service
public class CourseService {

	@Autowired
	private CourseRepository courseRepository;

	public List<Course> getAllCourses(String topicId) {
		return courseRepository.findByTopicId(topicId);
	}

	public Course getCourse(String id) {
		return courseRepository.findById(id).get();
	}

	public String addCourse(Course course, String topicId) {
		course.setTopic(new Topic(topicId, "", ""));
		courseRepository.save(course);
		return "Course added successfully";
	}

	public String updateCourse(Course course, String topicId) {
		course.setTopic(new Topic(topicId, "", ""));
		courseRepository.save(course);
		return "Course updated successfully";
	}

	public String deleteCourse(String id) {
		courseRepository.deleteById(id);
		return "Course deleted successfully";
	}

}
