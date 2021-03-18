  
import java.io.*; 
import javax.servlet.*; 
import javax.servlet.annotation.WebServlet; 
import javax.servlet.http.*; 
  
@WebServlet("/SecondServlet") // annotation 
public class SecondServlet extends HttpServlet { 
  
    public void doGet(HttpServletRequest request, HttpServletResponse response) 
    { 
        try { 
  
            response.setContentType("text/html"); 
            /* 
             * The response's character encoding is only set from the given 
             * content type if this method is called before getWriter is called. 
             * This method may be called repeatedly to change content type and 
             * character encoding. 
             */
            PrintWriter out = response.getWriter(); 
            /* 
             * The Java PrintWriter class ( java.io.PrintWriter ) enables you to 
             * write formatted data to an underlying Writer . For instance, 
             * writing int, long and other primitive data formatted as text, 
             * rather than as their byte values 
             */
            // getting value from the query string 
            String n = request.getParameter("uname"); 
            out.print("Hello " + n); 
            /* out.println is used to print on the client web browser */
            out.close(); 
        } 
        catch (Exception e) { 
            System.out.println(e); 
        } 
    } 
} 