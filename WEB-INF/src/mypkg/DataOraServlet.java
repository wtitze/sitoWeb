package mypkg;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

import java.util.Calendar;
 
public class DataOraServlet extends HttpServlet {
   @Override
   public void doGet(HttpServletRequest request, HttpServletResponse response)
               throws IOException, ServletException {
      // Set the response message's MIME type
      response.setContentType("text/html;charset=UTF-8");
      // Allocate a output writer to write the response message into the network socket
      PrintWriter out = response.getWriter();
      
      // get data e ora
      Calendar calendar = Calendar.getInstance();
      
 
      // Write the response message, in an HTML page
      try {
         out.println("<!DOCTYPE html>");
         out.println("<html><head>");
         out.println("<meta http-equiv='Content-Type' content='text/html; charset=UTF-8'>");
         out.println("<title>Hello, World</title></head>");
         out.println("<body>");
         out.println("<h1>Data e ora</h1>");
         out.println("Year: " + calendar.get(Calendar.YEAR) + "<br>");
         out.println("Month: " + calendar.get(Calendar.MONTH) + "<br>");
         out.println("Date: " + calendar.get(Calendar.DATE) + "<br>");
         out.println("Hour: " + calendar.get(Calendar.HOUR) + "<br>");
         out.println("Minute: " + calendar.get(Calendar.MINUTE) + "<br>");
         out.println("Second: " + calendar.get(Calendar.SECOND) + "<br>");

         out.println("</body>");
         out.println("</html>");
      } finally {
         out.close();  // Always close the output writer
      }
   }
}
