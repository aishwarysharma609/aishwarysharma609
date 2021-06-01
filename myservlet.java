import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class myservlet extends HttpServlet
{
 String msg="";
 PrintWriter out;
 public void init(ServletConfig config)throws ServletException{
     msg="Hello world";
    
 }
   public void doGet(HttpServletRequest request,HttpServletResponse
           response)throws ServletException,IOException 
   {
   response.setContentType("text/html");
   out=response.getWriter();
   out.println("<h1>"+msg+"</h1>");
   }
   public void destroy()
   {
   out.close();
   }
}
© 2021 GitHub, Inc.