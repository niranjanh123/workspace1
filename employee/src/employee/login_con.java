package employee;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class login_con extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String login;
	String pass;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
		System.out.println("Reached here");
	}

	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		 
		login = req.getParameter("usn");
		pass = req.getParameter("pass");
		res.setContentType("text/html;charset=UTF-8");
		if(login.equals("DSATMadmin")&&pass.equals("DSATMpassword")) {
			RequestDispatcher rs = req.getRequestDispatcher("Student_entry1.jsp");
			rs.forward(req, res);
		}
		else {
			RequestDispatcher rs = req.getRequestDispatcher("admin_login11.jsp");
		       rs.forward(req, res);
		}
	}
}