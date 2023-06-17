

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class loginmodule
 */
@WebServlet("/loginmodule")
public class loginmodule extends HttpServlet {
	private static final long serialVersionUID = 1L;
       @Override
    	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    		String a= req.getParameter("username");
    		String b= req.getParameter("password");
    		if(a.equals("abc")&&b.equals("xyz")) {
    			resp.sendRedirect("success.jsp");
    		}else {
    			resp.sendRedirect("error.jsp");
    		}
    		
    	}
}
