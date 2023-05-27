package in.bbnhinew.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/wishapp")
public class WishServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public void doGet(HttpServletRequest request, HttpServletResponse response)  throws  IOException {
        response.setContentType("text/html");
        PrintWriter pw = response.getWriter();
        pw.println("good morning");

        pw.close();
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response)  throws  IOException  {
        doGet(request, response);
    }
}