package login_proj.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import login_proj.dto.Users;
import login_proj.service.LoginService;


@WebServlet("/login/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public LoginServlet() {
        super();
    }

	

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String passwd =request.getParameter("passwd");
		
		
		LoginService service = new LoginService();
		
		Users loginUser = service.getLoginUser(id, passwd);
		
		if(loginUser !=null) {
			HttpSession session = request.getSession();
			session.setAttribute("id",id);
			System.out.println("주소찾아야한당");
			response.sendRedirect("../index.jsp");
		}else {
			response.setContentType("text/html;charset=UTF-8");
			PrintWriter out =response.getWriter();
			out.println("<script>");
			out.println("alert('로그인실패')");
			out.println("history.back()");
			out.println("</script>");
			
		}
	}

}
