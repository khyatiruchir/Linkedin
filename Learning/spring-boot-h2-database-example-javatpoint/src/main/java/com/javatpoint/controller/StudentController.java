package com.javatpoint.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.javatpoint.model.Student;
import com.javatpoint.service.StudentService;
//creating RestController
@RestController
public class StudentController 
{
	//autowired the StudentService class
	@Autowired
	StudentService studentService;
	
	//creating a get mapping that retrieves all the students detail from the database 
	@GetMapping("/student")
	public List<Student> getAllStudent() 
	{
		return studentService.getAllStudent();
	}
	//creating a get mapping that retrieves the detail of a specific student
	@GetMapping("/student/{id}")
	public Student getStudent(@PathVariable("id") int id) 
	{
		return studentService.getStudentById(id);
	}
	//creating a delete mapping that deletes a specific student
	@DeleteMapping("/student/{id}")
	public void deleteStudent(@PathVariable("id") int id) 
	{
		studentService.delete(id);
	}
	//creating post mapping that post the student detail in the database
	@PostMapping("/student")
	public int saveStudent(@RequestBody Student student) 
	{
		Student s = new Student();
		s.setAge(student.getAge());
		s.setEmail(student.getEmail());
		//s.setId(student.getId());
		s.setName(student.getName());
		studentService.saveOrUpdate(s);
		return s.getId();
	}
}
