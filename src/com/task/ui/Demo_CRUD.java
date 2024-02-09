
//main method and class

package com.task.ui;
import java.sql.SQLException;
import java.util.*; 
import com.task.service.*;
import com.task.bean.*;
public class Demo_CRUD {
     public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Select your option");
		System.out.println("1.Insert employee data");
		System.out.println("2.Update employee data");
		System.out.println("3.Select employee data");
		System.out.println("4.Delete employee data");
		int option=sc.nextInt();
		
		switch(option) {
		case 1:
		{
			insertEmployee();
			break;
		}
		case 2:
		{
			updateEmployee();
			break;
		}
		case 3:
		{
			selectEmployee();
			break;
		}
		case 4:
		{
			deleteEmployee();
			break;
		}
		default:
		{
			System.out.println("Your entered option is not matched");
		}
		
		}
	}

	private static void insertEmployee() throws ClassNotFoundException, SQLException {  
		EmployeeServiceImp1 service=new EmployeeServiceImp1();   //connect to service class
		EmployeeBean bean=new EmployeeBean();    //can access any class through bean
		bean.setemp_id(1005);
		bean.setemp_name("Oms");
		bean.setemp_address("NY");
		service.insertEmployee(bean);  //sends data in insert option through bean
				
	}
	
	private static void updateEmployee() throws ClassNotFoundException, SQLException {
		EmployeeServiceImp1 service=new EmployeeServiceImp1();
		EmployeeBean bean=new EmployeeBean();
		bean.setemp_id(1003);
		bean.setemp_name("Priya");
		service.updateEmployee(bean);
	}
	
	private static void selectEmployee() throws ClassNotFoundException, SQLException {
		EmployeeServiceImp1 service=new EmployeeServiceImp1();
		EmployeeBean bean=new EmployeeBean();
		bean.setemp_id(1001);
        service.selectEmployee(bean);
		
	}
	
	private static void deleteEmployee() throws ClassNotFoundException, SQLException {
		EmployeeServiceImp1 service=new EmployeeServiceImp1();
		EmployeeBean bean=new EmployeeBean();
		bean.setemp_id(1003);
        service.deleteEmployee(bean);
	}
}
