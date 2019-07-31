package com.mphasis.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mphasis.demo.bos.AssignmentBo;

import com.mphasis.demo.entities.Assignment;

@RestController
@RequestMapping("/assignment")
public class AssignmentContoller {
	
	@Autowired
	AssignmentBo assignmentBo;
	
	@RequestMapping(value="/assignments", method=RequestMethod.GET,
			produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Assignment> getAll(){
		return assignmentBo.getAssinments();
	}
	
	
	public void addAssignment() {
		
	}
	

}
