package com.shrishti.course;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {
	@Autowired
	ICourses backendDeveloper;
	@Autowired
	ICourses fullstackDeveloper;
	@Autowired
	ICourses webDeveloper;

	public List<String> showCourses(String courseType) {
		List<String> result = new ArrayList<>();
		if (courseType.equals("b"))
			result = backendDeveloper.courseDetails();
		if (courseType.equals("f"))
			result = fullstackDeveloper.courseDetails();
		if (courseType.equals("w"))
			result = fullstackDeveloper.courseDetails();
		return result.stream().sorted().collect(Collectors.toList());
	}
}
