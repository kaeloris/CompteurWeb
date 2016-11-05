/**
 * Created by Lucas-PC on 02/11/2016.
 */
import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Index extends HttpServlet {

	@Override
	public void doGet( HttpServletRequest request, HttpServletResponse response )
			throws ServletException, IOException {
		String[] listpays = {"France","Royaume-Uni","USA","Russie","Yemen"};
		request.setAttribute("listpays",listpays);
		this.getServletContext()
				.getRequestDispatcher( "/index.jsp" )
				.forward( request, response );
	}

}
