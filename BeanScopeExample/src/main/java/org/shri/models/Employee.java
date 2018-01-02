package org.shri.models;

public class Employee{
	private int empId;
	private String empName;
	private String employerName;
	
	public Employee() {
		System.out.println("Initializing employee object....");
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmployerName() {
		return employerName;
	}
	public void setEmployerName(String employerName) {
		this.employerName = employerName;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", employerName=" + employerName + "]";
	}
	
}
