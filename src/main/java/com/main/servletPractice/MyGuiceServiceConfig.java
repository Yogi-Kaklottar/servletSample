package com.main.servletPractice;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.servlet.GuiceServletContextListener;
import com.google.inject.servlet.ServletModule;

public class MyGuiceServiceConfig extends GuiceServletContextListener{

	@Override
	protected Injector getInjector() {
		
		return Guice.createInjector(new ServletModule() {
		
				@Override
				protected void configureServlets() {
					serve("/MyServlet").with(MyServlet.class);
					bind(MyService.class).to(MyServiceImplement.class);
				}
			
		});
	}

}
