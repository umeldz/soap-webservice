package com.in28minutes.soap.webservices.soapdemo.soap.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Component;

import com.in28minutes.soap.webservices.soapdemo.soap.bean.Course;

@Component
public class CourseDetatialsService {

	private static List<Course> courses = new ArrayList<>();

	static {
		Course course1 = new Course(1, "Spring boot", "Learning spring boot");
		courses.add(course1);
		Course course2 = new Course(2, "Spring MVC", "Learning spring MVC");
		courses.add(course2);
		Course course3 = new Course(3, "Spring Cloud", "Learning spring Cloud");
		courses.add(course3);
		Course course4 = new Course(4, "Spring Security", "Learning spring security");
		courses.add(course4);
		Course course5 = new Course(5, "Spring Batch ", "Learning spring batch");
		courses.add(course5);
	}

	// course - 1
	// Course findById(int id)
	public Course findById(int id) {
		for (Course course : courses) {
			if (course.getId() == id)
				return course;
		}
		return null;
	}

	// courses
	// List<Course> findAll()
	public List<Course> findAll() {
		return courses;
	}

	// deletecourse
	public int delete(int id) {
		Iterator<Course> iterator = courses.iterator();
		while (iterator.hasNext()) {
			Course course = iterator.next();
			if (course.getId() == id) {
				iterator.remove();
				return 1;
			}

		}
		return 0;
	}
	// updating course & new course

}
