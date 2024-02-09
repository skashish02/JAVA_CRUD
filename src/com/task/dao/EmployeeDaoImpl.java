package com.task.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.task.bean.EmployeeBean;
import com.task.util.DBUtil;

public class EmployeeDaoImpl implements IEmployeeDao{  //added unimplemented methods
	public static PreparedStatement pst;
	public static Connection connection;
	
	
	@Override
	public void insertEmployee(EmployeeBean bean) throws ClassNotFoundException, SQLException {
		int emp_id=bean.getemp_id();
		String emp_name=bean.getemp_name();
		String emp_address=bean.getemp_address();
		connection=DBUtil.getDBConnection();
		pst=connection.prepareStatement("insert into emp values(?,?,?)");
		pst.setInt(1, emp_id);
		pst.setString(2, emp_name);
		pst.setString(3, emp_address);
		
		pst.executeUpdate();
		System.out.println("Inserted one record successfully");
	}


	@Override
	public void updateEmployee(EmployeeBean bean) throws SQLException, ClassNotFoundException {
		int emp_id=bean.getemp_id();
		String emp_name=bean.getemp_name();
		String emp_address=bean.getemp_address();
		connection=DBUtil.getDBConnection();
		pst=connection.prepareStatement("update emp set emp_name=? where emp_id=? ");
		
		pst.setString(1, emp_name);
		pst.setInt(2, emp_id);
		
		
		pst.executeUpdate();
		System.out.println("Successfully updated your data");
	}
	
	public void selectEmployee(EmployeeBean bean) throws ClassNotFoundException, SQLException {
		int emp_id=bean.getemp_id();
		String emp_name=bean.getemp_name();
		String emp_address=bean.getemp_address();
		connection=DBUtil.getDBConnection();
		pst=connection.prepareStatement("Select * from emp where emp_id=? ");
		
		pst.setInt(1, emp_id);
		
		ResultSet rs=pst.executeQuery();
		while(rs.next()) {
			System.out.println("Employee ID: "+rs.getInt(1)+" "+"Employee Name: "+rs.getString(2)+" "+"Employee Address: "+rs.getString(3));
		}
		System.out.println("Selected the required data");
	}


	public void deleteEmployee(EmployeeBean bean) throws ClassNotFoundException, SQLException {
		int emp_id=bean.getemp_id();
		String emp_name=bean.getemp_name();
		String emp_address=bean.getemp_address();
		connection=DBUtil.getDBConnection();
		pst=connection.prepareStatement("delete from emp where emp_id=? ");
		
		pst.setInt(1, emp_id);
		pst.executeUpdate();
		
		System.out.println("Deleted the required data successfully");
		
	}
       
}
