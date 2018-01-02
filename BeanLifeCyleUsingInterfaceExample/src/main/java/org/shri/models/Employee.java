package org.shri.models;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Employee implements InitializingBean, DisposableBean{

	private int empId;
	private String empName;
	private String empCompany;
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
	public String getEmpCompany() {
		return empCompany;
	}
	public void setEmpCompany(String empCompany) {
		this.empCompany = empCompany;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empCompany=" + empCompany + "]";
	}
	
	public void destroy() throws Exception {
		System.out.println("Just After destroyed bean....");
		
	}
	public void afterPropertiesSet() throws Exception {
		System.out.println("Just After Initialized bean/propety set....");
	}
	
}
