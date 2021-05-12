import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Test extends HttpServlet {
  public void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException{
    String message = "Transmission de variables : OK !";
    request.setAttribute( "test", message );
    this.getServletContext().getRequestDispatcher( "/WEB-INF/test.jsp").forward( request, response );
  }
}
