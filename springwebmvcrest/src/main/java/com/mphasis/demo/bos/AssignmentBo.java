package com.mphasis.demo.bos;

import java.util.List;

import com.mphasis.demo.entities.Assignment;

public interface AssignmentBo {
	public List<Assignment> getAssinments();
	public Assignment getAssignmentById(int id);
	public void insertAssignment(Assignment Assignment);
	public void updateAssignment(Assignment Assignment);
	public void deleteAssignment(int id);

}
