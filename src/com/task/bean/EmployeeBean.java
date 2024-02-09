package com.task.bean;

public class EmployeeBean {
    private int emp_id;
    private String emp_name;
    private String emp_address;
	public int getemp_id() {
		return emp_id;
	}
	public void setemp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public String getemp_name() {
		return emp_name;
	}
	public void setemp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public String getemp_address() {
		return emp_address;
	}
	public void setemp_address(String emp_address) {
		this.emp_address = emp_address;
	}
	@Override
	public String toString() {
		return "EmployeeBean [emp_id=" + emp_id + ", emp_name=" + emp_name + ", emp_address=" + emp_address
				+ ", getemp_id()=" + getemp_id() + ", getemp_name()=" + getemp_name() + ", getemp_address()="
				+ getemp_address() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	public EmployeeBean() {
	
		// TODO Auto-generated constructor stub
	}
	public EmployeeBean(int emp_id, String emp_name, String emp_address) {
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.emp_address = emp_address;
	}
    
    
}
