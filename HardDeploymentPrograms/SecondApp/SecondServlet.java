import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.annotation.*;

@WebServlet(urlPatterns={"/test"}, loadOnStartup=1)
public class SecondServlet implements Servlet {

	static{
		System.out.println("servlet loading");
	}

	public SecondServlet() {
		System.out.println("servlet initialization ");
	}

	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
				System.out.println("servlet Initialized 222");

	}


	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
        System.out.println("Inside service 222");

		response.setContentType("text/html");

		// TODO Auto-generated method stub
		System.out.println("providing service to user 2222");
		PrintWriter out = response.getWriter();
		out.println("<html><body>Hello</body></html>");
		out.close();
	}

	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("Servlet destroing 2222");
		
	}

	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getServletInfo() {
		// TODO Auto-generated method stub
		return "Deployed by BBNH 222";
	}
}