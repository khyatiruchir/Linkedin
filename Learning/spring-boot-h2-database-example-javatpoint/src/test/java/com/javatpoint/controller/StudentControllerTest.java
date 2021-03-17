package com.javatpoint.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentMatchers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import com.javatpoint.model.Student;
import com.javatpoint.service.StudentService;

@ExtendWith(MockitoExtension.class)
class StudentControllerTest {
	
	@Mock
	StudentService studentServiceMock;
	
	@InjectMocks
	StudentController studentController;
	
	@BeforeEach
	public void setup() {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void getStudentTest() {
		System.out.print("in getstudent method");
		Student s=mock(Student.class);
		when(studentServiceMock.getStudentById(ArgumentMatchers.any(Integer.class))).thenReturn(s);
		assertEquals(s, studentController.getStudent(0));
	}
	
	@Test
	public void savestudentTest() {
		int i = 100;
		Student s=mock(Student.class);
		when(s.getId()).thenReturn(i);
		assertEquals(i, studentController.saveStudent(s));
	}

}