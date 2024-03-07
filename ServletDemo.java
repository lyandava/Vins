import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class ServletDemo extends HttpServlet {
    String msg;

    public void init() {
        msg = "Hello Mohan";
    }

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html"); // setting the content type  
        PrintWriter out = res.getWriter(); // get the stream to write the data  
        try {
            // writing html in the stream
            out.println("<html><body>");
            out.println("<h1>" + msg + "</h1>");
            out.println("</body></html>");
        } catch (Exception e) {
            out.close(); // closing the stream
        }
    }
}
