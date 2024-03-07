package com.wipro;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Servlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private String msg;

    @Override
    public void init() throws ServletException {
        try {
            msg = "Hello World";
            // Additional initialization if needed
        } catch (Exception e) {
            throw new ServletException("Initialization failed", e);
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html");
        try (PrintWriter out = res.getWriter()) {
            out.println("<html><body>");
            out.println("<h1>" + msg + "</h1>");
            out.println("</body></html>");
        } catch (IOException e) {
            throw new ServletException("Error writing response", e);
        }
    }
}
