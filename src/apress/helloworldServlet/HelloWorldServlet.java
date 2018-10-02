/**
 * 
 */
package apress.helloworldServlet;

/**
 * @author diegomora
 *
 */

import java.io.IOException;
import java.io.PrintWriter;

/**Library for Servlet**/
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class HelloWorldServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) {
		
		try {
			
			/**Response of content Type**/
			response.setContentType("text/html");
			PrintWriter printWriter = response.getWriter();
			/**View of the server**/
			printWriter.println("<H2>");
			printWriter.println("Hello World");
			printWriter.println("</H2>");
			
		}catch (IOException ioException) {
			// TODO: handle exception
			
		}
		
	}

}
