package org.shri.models;

import java.util.Map;

public class Student {
	
	private int studentId;
	private String studentName;
	private Map<String, Integer> marksheet;
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public Map<String, Integer> getMarksheet() {
		return marksheet;
	}
	public void setMarksheet(Map<String, Integer> marksheet) {
		this.marksheet = marksheet;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName="
				+ studentName + ", marksheet=" + marksheet + "]";
	}
	
	

}
