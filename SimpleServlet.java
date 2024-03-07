import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class SimpleServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {

        // Set the content type of the response
        response.setContentType("text/html");

        // Get the PrintWriter object to write the HTML page
        PrintWriter out = response.getWriter();
        
        // Write the HTML content
        out.println("<html>");
        out.println("<head><title>Simple Servlet Example</title></head>");
        out.println("<body>");
        out.println("<h1>Hello Everyone, Servlet World!</h1>");
        out.println("<p>This is a simple servlet example.</p>");\\
        out.println("</body></html>");

        // Close the PrintWriter
        out.close();
    }
}
