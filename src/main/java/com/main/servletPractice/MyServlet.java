package com.main.servletPractice;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@com.google.inject.Singleton
public class MyServlet extends HttpServlet {
		private static final long serialVersionUID=1L;
		@com.google.inject.Inject
	     MyService myservice;
		
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
				
		resp.getWriter().write(myservice.Display("hiren solanki"));
			//ServletOutputStream sos = resp.getOutputStream();
			//sos.print("Hello");
		}
		
}
