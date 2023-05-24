package io.javabbnh.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

/**
 * Servlet implementation class BrowserResponseApp
 */
public class BrowserResponseApp extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	static {
		System.out.println("Servlet loading");
	}
	
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BrowserResponseApp() {
        super();
        // TODO Auto-generated constructor stub
        System.out.println("Servlet Instantiation");
    }
    
    @Override
    public void init() throws ServletException {
    	// TODO Auto-generated method stub
    	super.init();
    	System.out.println("Servlet Initialization");
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		System.out.println("Response processing from GET Request type .... ");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<h1>Request header info</h1>");
		Enumeration<String> headerNames = request.getHeaderNames();
		
		while(headerNames.hasMoreElements()) {
			String hdrName = headerNames.nextElement();
			String hdrValue = request.getHeader(hdrName);
			out.println();
			out.println("<span>"+hdrName+"</span>");
			out.println();
			out.println("<span>"+hdrValue+"</span>");
			out.println();
		}
		
		System.out.println(request.getRemoteHost());
		System.out.println(request.getRemoteAddr());
		System.out.println(request.getRemotePort());
		System.out.println(request.getServerName());
		System.out.println(request.getServerPort());
		
		out.close();
	}
	
	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		super.destroy();
		System.out.println("inside the destroy");
	}

}
