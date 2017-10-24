package tech.ucwork;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class HelloServlet extends HttpServlet {
  public void doGet(HttpServletRequest request, HttpServletResponse response)
    throws IOException, ServletException{

    response.setContentType("text/html; charset=Shift_JIS");
    PrintWriter out = response.getWriter();

    HttpSession session = request.getSession(false);

    out.println("<html>");
    out.println("<head>");
    out.println("<title>セッションテスト</title>");
    out.println("</head>");
    out.println("<body>");

    if (session == null){
      Person person = new Person("uchi", "shin", 1);
      out.println("<p>初回訪問です</p>");
      session = request.getSession(true);
      session.setAttribute("person", person);
    }else{
      Person person = (Person)session.getAttribute("person");
      int age = person.getAge();
      age++;
      person.setAge(age);
      session.setAttribute("person", person);

      out.println("<p>年齢は");
      out.println(person.getAge());
      out.println("です</p>");

    }

    out.println("</body>");
    out.println("</html>");
  }
}
