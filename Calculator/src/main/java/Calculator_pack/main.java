package Calculator_pack;

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
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		String num1, num2, btn;
		num1=request.getParameter("num1_i");
		num2=request.getParameter("num2_i");
		btn=request.getParameter("btn");
		
		if(btn.equalsIgnoreCase("add")) {
			num1=request.getParameter("num1_i");
			num2=request.getParameter("num2_i");
			int sum=Integer.parseInt(num1)+Integer.parseInt(num2);
			pw.print("\nNumber 1 : "+num1);
			pw.print("\nNumber 2 : "+num2);
			pw.print("\nThe Answer is : "+sum);
		}
		else if(btn.equalsIgnoreCase("sub")) {
			num1=request.getParameter("num1_i");
			num2=request.getParameter("num2_i");
			int sum=Integer.parseInt(num1)-Integer.parseInt(num2);
			pw.print("\nNumber 1 : "+num1);
			pw.print("\nNumber 2 : "+num2);
			pw.print("\nThe Answer is : "+sum);
		}
		else if(btn.equalsIgnoreCase("multi")) {
			num1=request.getParameter("num1_i");
			num2=request.getParameter("num2_i");
			int sum=Integer.parseInt(num1)*Integer.parseInt(num2);
			pw.print("\nNumber 1 : "+num1);
			pw.print("\nNumber 2 : "+num2);
			pw.print("\nThe Answer is : "+sum);
		}
		else if(btn.equalsIgnoreCase("div")) {
			num1=request.getParameter("num1_i");
			num2=request.getParameter("num2_i");
			int sum=Integer.parseInt(num1)/Integer.parseInt(num2);
			pw.print("\nNumber 1 : "+num1);
			pw.print("\nNumber 2 : "+num2);
			pw.print("\nThe Answer is : "+sum);
		}
		else {
			pw.print("An Error Occured! Ivalid Input!");
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
