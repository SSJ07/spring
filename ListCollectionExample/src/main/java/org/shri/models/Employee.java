package org.shri.models;

import java.util.List;
/**
 * 
 * This is Emloyee pojo class.
 * @author shri
 *
 */
public class Employee {
	
	private int empId;
	private String empName;
	private List<Address> addresses;
	
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
	public List<Address> getAddresses() {
		return addresses;
	}
	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName
				+ ", addresses=" + addresses + "]";
	}
	
	
	

}
