package com.shrishti.course;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

@Component
public class FullstackDeveloper implements ICourses {

	@Override
	public List<String> courseDetails() {
		return Arrays.asList("Spring", "Mockito", "JUnit");
	}

}
