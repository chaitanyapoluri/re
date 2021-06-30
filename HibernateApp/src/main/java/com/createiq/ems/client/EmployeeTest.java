package com.createiq.ems.client;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.createiq.ems.dao.EmployeeDAO;
import com.createiq.ems.dao.EmployeeDaoImpl;
import com.createiq.ems.entity.Employee;

public class EmployeeTest {

	public static void main(String[] args) {
//			Configuration configuration = new Configuration().configure("com/createiq/ems/config/employee.cfg.xml");
//			SessionFactory sfFactory = configuration.buildSessionFactory();
//			Session session = sfFactory.openSession();
////		Employee employee = new Employee("balu", 32000.00, "balu@gmail.com");
////		session.save(employee);
////		Employee employee = (Employee) session.get(Employee.class, 1);
////		System.out.println(employee);
////		session.getTransaction().commit();
////		session.beginTransaction().commit();
//		Employee employee = (Employee) session.load(Employee.class, 1);
//		System.out.println(employee);
//		System.out.println(session.isConnected());
//		session.close();
//		System.out.println(session.isConnected());

		EmployeeDAO dao = new EmployeeDaoImpl();
		List<Employee> allEmps = dao.getAllEmps();
		for (Employee employee : allEmps) {
			System.out.println(employee);
		}

	}

}