package com.prowings.webApp;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.prowings.dao.HibernateUtil;
import com.prowings.entity.Student;

public class StudentServlet extends HttpServlet {

	/**
	 *
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		String name = request.getParameter("name");
		String rollno = request.getParameter("rollNo");
		String address = request.getParameter("address");

		System.out.println("Name :" + name);
		System.out.println("Roll No :" + rollno);
		System.out.println("Address :" + address);

		Student std = new Student();

		std.setRollNo(Integer.parseInt(rollno));
		std.setName(name);
		std.setAddress(address);

		System.out.println(std);

		System.out.println(">>>>>>>>>>> Student Save to DB <<<<<<<<<<");

		SessionFactory sf = HibernateUtil.getSessionFactory();

		Session session = sf.openSession();

		Transaction trans = session.beginTransaction();

		session.save(std);

		trans.commit();
		session.close();
//		sf.close();
	}

}
