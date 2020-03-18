package database;

import javax.servlet.ServletContext;

public class Database {
	public static ServletContext servletContext;
	

	public static ServletContext getServletContext() {
		return servletContext;
	}

	public static void setServletContext(ServletContext servletContext) {
		Database.servletContext = servletContext;
	}
	
	

}
