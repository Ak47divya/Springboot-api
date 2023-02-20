package com.restdemo.springRest.services;

import java.util.List;

import com.restdemo.springRest.entities.Subject;

public interface SubjectService {
	public List<Subject> getSubjects();
	
	public Subject getSubject(long subjectId);
	
	public Subject addSubject(Subject subject) ;
	
	public Subject updateSubject(Subject subject);
	
	public void deleteSubject(long parseLong);

}
