package form_pack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class main
 */
@WebServlet("/main")
public class main extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public main() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		String name, roll, marks, gender, course, phno, email, address;
		name=request.getParameter("name_i");
		
		roll=request.getParameter("roll_i");
		
		marks=request.getParameter("marks_i");
		
		gender=request.getParameter("gender_i");
		
		course=request.getParameter("course_i");
		
		phno=request.getParameter("phno_i");
		
		email=request.getParameter("email_i");
		
		address=request.getParameter("add_i");
		
		pw.print("Name : "+name);
		pw.print("<br>");
		pw.print("Roll : "+roll);
		pw.print("<br>");
		pw.print("Marks : "+marks);
		pw.print("<br>");
		pw.print("Phone Number : "+phno);
		pw.print("<br>");
		pw.print("Course : "+course);
		pw.print("<br>");
		pw.print("Gender : "+gender);
		pw.print("<br>");
		pw.print("Email : "+email);
		pw.print("<br>");	
		pw.print("Address : "+address);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
