package org.shri.models;

public class Employee extends Person{
	private int empId;
	private String employerName;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmployerName() {
		return employerName;
	}
	public void setEmployerName(String employerName) {
		this.employerName = employerName;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId +" firstName= "+ this.getFirstName()+ " lastName="+ this.getLastName() + ", employerName=" + employerName + "]";
	}
	
	
}
