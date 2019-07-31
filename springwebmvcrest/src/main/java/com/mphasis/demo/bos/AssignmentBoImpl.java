package com.mphasis.demo.bos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mphasis.demo.daos.AssignmentDao;
import com.mphasis.demo.entities.Assignment;
import com.mphasis.demo.exceptions.BuissnesException;

@Service
public class AssignmentBoImpl implements AssignmentBo {
	
	@Autowired
	AssignmentDao assignmentDao;

	public List<Assignment> getAssinments() {
		// TODO Auto-generated method stub
		return assignmentDao.getAssinments();
	}

	public Assignment getAssignmentById(int id) {
		// TODO Auto-generated method stub
		return assignmentDao.getAssignmentById(id);
	}

	public void insertAssignment(Assignment assignment) {
		if(assignment.getGrade()>60)
		assignmentDao.insertAssignment(assignment);
		else
			throw new BuissnesException("Grade is less");

	}

	public void updateAssignment(Assignment assignment) {
		if(assignment.getGrade()>60)
			assignmentDao.updateAssignment(assignment);
		else
			throw new BuissnesException("Grade is less");
	}

	public void deleteAssignment(int id) {
		// TODO Auto-generated method stub
		assignmentDao.deleteAssignment(id);
	}

}
