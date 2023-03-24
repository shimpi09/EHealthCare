package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.datastorage.DataStorage;
import com.ehealthcare.Doctor;

@WebServlet("/DoctorReg")
public class DoctorRg extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
		
			String name=request.getParameter("name");
			String gender=request.getParameter("gender");
			String specialist=request.getParameter("specialist");
			String address=request.getParameter("address");
			String smobile=request.getParameter("mobile");
			long mobile=Long.parseLong(smobile);
			String email=request.getParameter("email");
			String username=request.getParameter("username");
			String password=request.getParameter("password");
			
			Doctor dr = new Doctor(name,gender, specialist, address, mobile, email, username, password);
			
			Session se = DataStorage.getFactory().openSession();
			Transaction tr = se.beginTransaction();
			se.persist(dr);
			//se.save(dr);
			tr.commit();
			se.close();
			
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			out.println("<h1>Rgistration Successfully</h1>");
			
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}

}

