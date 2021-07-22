package com.endava.pocu.web;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class DemoServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setStatus(HttpServletResponse.SC_OK);

        resp.getWriter().println("<html>");
        resp.getWriter().println("<body>");
        resp.getWriter().println("<h1>");
        resp.getWriter().println("Hello Servlet");
        resp.getWriter().println("</h1>");
        resp.getWriter().println("</body>");
        resp.getWriter().println("</html>");

        //resp.setHeader("Content-Type", "text/plain");
    }
}
