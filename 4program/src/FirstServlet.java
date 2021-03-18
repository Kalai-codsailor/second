import java.io.*; 
import javax.servlet.*; 
import javax.servlet.annotation.WebServlet; 
import javax.servlet.http.*; 
@WebServlet("/FirstServlet") // annotation 
  
// this annotation is used for replacing xml file 
public class FirstServlet extends HttpServlet { 
  
    // class name is FirstServlet which extends HttpServlet 
    public void doGet(HttpServletRequest request, HttpServletResponse response) 
    { 
        try { 
            response.setContentType("text/html"); 
           /* The response's character encoding is only set  
from the given content type if this method  
is called before getWriter is called.  
This method may be called repeatedly to  
change content type and character encoding.*/
            PrintWriter out = response.getWriter(); 
  
  
            /*T he Java PrintWriter class ( java.io.PrintWriter ) enables you to  
          write formatted data to an underlying Writer .  
         For instance, writing int, long and other primitive data 
          formatted as text, rather than as their byte values*/
            String n = request.getParameter("userName"); 
             
//request.getParameter takes the value from index.html file 
  // where name is username 
            out.print("Welcome " + n); 
  
// out.println is used to print on the client web browser 
  
 //url rewriting is used for creating session  
//       it will redirect  you to SecondServlet page 
            out.print("<a href='SecondServlet?uname=" + n + "'>visit</a>"); 
  
            out.close(); 
        } 
        catch (Exception e) { 
            System.out.println(e); 
        } 
    } 
} 