package com.bridgeit.jdbctemplateexample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

		EmployeeDao dao = (EmployeeDao) ctx.getBean("edao");
		int status = dao.saveEmployee(new Employee(102, "Amit", 35000));
		System.out.println(status);

		/*
		 * int status=dao.updateEmployee(new Employee(102,"Sonoo",15000));
		 * System.out.println(status);
		 */

		/*
		 * Employee e=new Employee(); e.setId(102); int status=dao.deleteEmployee(e);
		 * System.out.println(status);
		 */

	}

}
