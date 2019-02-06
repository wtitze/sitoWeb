package mypkg;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
 
public class Saluta2 extends HttpServlet {
   @Override
   public void doGet(HttpServletRequest request, HttpServletResponse response)
               throws IOException, ServletException {
      // Set the response message's MIME type
      response.setContentType("text/html;charset=UTF-8");

      request.setAttribute("message", request.getParameter("nome") + " " + request.getParameter("cognome"));              
      RequestDispatcher view = request.getRequestDispatcher("risposta.jsp");      
      view.forward(request, response);
      
   }
}
