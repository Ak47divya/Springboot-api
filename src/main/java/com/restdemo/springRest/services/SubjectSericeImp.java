package com.restdemo.springRest.services;


import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restdemo.springRest.dao.SubjectDao;
import com.restdemo.springRest.entities.Subject;

@Service
public class SubjectSericeImp implements SubjectService{
	
@Autowired	
private	SubjectDao subjectDao;
	
	
	
	
	
	
	
	
	
	
	 // List<Subject> list;
	
	public SubjectSericeImp()
	{
		// list  = new ArrayList<>();
		// list.add(new Subject(145,"Java","This is programming language"));
		//list.add(new Subject(4343,"Spring boot", "Creating Rest API using Spring boot"));
	}

	@Override
	public List<Subject> getSubjects() {
		// TODO Auto-generated method stub
		return subjectDao.findAll();
	}

	@Override
	public Subject getSubject(long subjectId) {
		// TODO Auto-generated method stub
		
//		Subject s =null;
//		for(Subject subject:list)
//		{
//			if(subject.getId()==subjectId)
//			{
//				s =subject;
//				break;
//			}
//		}
		return subjectDao.getOne(subjectId);
	}

	@Override
	public Subject addSubject(Subject subject) {
		
	//	list.add(subject);
		// TODO Auto-generated method stub
		subjectDao.save(subject);
		return subject;
	}

	@Override
	public Subject updateSubject(Subject subject) {
		// TODO Auto-generated method stub
		
//		list.forEach(e -> {
//			if(e.getId() == subject.getId()) {
//				e.setTitle(subject.getTitle());
//				e.setDescription(subject.getDescription());
//			}
//		});
		
		subjectDao.save(subject);
		return subject;
	}

	@Override
	public void deleteSubject(long parseLong) {
		// TODO Auto-generated method stub
		
	//	list = this.list.stream().filter(e->e.getId()!=parseLong).collect(Collectors.toList());
		
		 Subject entity = subjectDao.getOne(parseLong);
		 subjectDao.delete(entity);
	}

}

