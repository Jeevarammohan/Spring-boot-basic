package com.shrishti.course;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

@Component
public class WebDeveloper implements ICourses {

	@Override
	public List<String> courseDetails() {

		return Arrays.asList("MVC", "API", "RestApi");
	}
}
