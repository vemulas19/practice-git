package com.employee;

public class EmployeePojo {

	private Integer id;
	private String empName;
	private String empBranch;
	private String empLocation;
	private String empAddress;
	
	public EmployeePojo(Integer id, String empName, String empBranch, String empLocation, String empAddress) {
		super();
		this.id = id;
		this.empName = empName;
		this.empBranch = empBranch;
		this.empLocation = empLocation;
		this.empAddress = empAddress;
	}
	public String getEmpAddress() {
		return empAddress;
	}
	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpBranch() {
		return empBranch;
	}
	public void setEmpBranch(String empBranch) {
		this.empBranch = empBranch;
	}
	public String getEmpLocation() {
		return empLocation;
	}
	public void setEmpLocation(String empLocation) {
		this.empLocation = empLocation;
	}
	
}
