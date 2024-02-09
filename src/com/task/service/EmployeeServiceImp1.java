package com.task.service;

import java.sql.SQLException;

import com.task.bean.EmployeeBean;
import com.task.dao.*;
public class EmployeeServiceImp1 implements IEmployeeService{

	@Override
	public void insertEmployee(EmployeeBean bean) throws ClassNotFoundException, SQLException {   
		 EmployeeDaoImpl dao=new EmployeeDaoImpl();
		 		 dao.insertEmployee(bean);  //passing bean data from service to dao  connecting service class to dao 
	}

	@Override
	public void updateEmployee(EmployeeBean bean) throws ClassNotFoundException, SQLException{
		EmployeeDaoImpl dao=new EmployeeDaoImpl();
		      dao.updateEmployee(bean);
		
	}

	@Override
	public void selectEmployee(EmployeeBean bean) throws ClassNotFoundException, SQLException {
		EmployeeDaoImpl dao=new EmployeeDaoImpl();
		       dao.selectEmployee(bean);
		
	}


	

	public void deleteEmployee(EmployeeBean bean) throws ClassNotFoundException, SQLException {
		EmployeeDaoImpl dao=new EmployeeDaoImpl();
	       dao.deleteEmployee(bean);
		
	}
	
	
    
}

