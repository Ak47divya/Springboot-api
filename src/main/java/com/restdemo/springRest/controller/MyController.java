package com.restdemo.springRest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.restdemo.springRest.entities.Subject;
import com.restdemo.springRest.services.SubjectService;

@RestController
public class MyController {
	@Autowired
	private SubjectService subjectService;
	
	@GetMapping("/home")
	public String home()
	{
		return "WELCOME TO THE APPLICATION";
	}
	
	//get the subjects
	
	@GetMapping("/Subjects")
	public List<Subject> getSubjects()
	{
		return this.subjectService.getSubjects();
	}
	
	//get the single subject
	@GetMapping("/Subjects/{subjectId}")
	public Subject getSubject(@PathVariable String subjectId)
	{
		return this.subjectService.getSubject(Long.parseLong(subjectId));
	}
	
	//subjects adding
	@PostMapping("/Subjects")
	public Subject addSubject(@RequestBody Subject subject)
	{
		return this.subjectService.addSubject(subject);
	}
	
	
	
	//update subject using PUT request
	
	@PutMapping("/Subjects")
	public Subject updateSubject(@RequestBody Subject subject)
	{
		return this.subjectService.updateSubject(subject);
	}
	
	//Deleting the Subject
	
	@DeleteMapping("/Subjects/{subjectId}")
	public ResponseEntity<HttpStatus> deleteSubject(@PathVariable String subjectId)
	{
		try
		{
			this.subjectService.deleteSubject(Long.parseLong(subjectId));
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (Exception e)
		{
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	

}
