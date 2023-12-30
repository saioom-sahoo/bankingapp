package banking.controller;

import java.io.IOException;

import banking.service.CustomerService;
import banking.view.SignupPage;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/signin")
public class SignupController extends HttpServlet{	
	private static final long serialVersionUID = 1L;
	
	private final CustomerService service;

	public SignupController() {
		service = new CustomerService();
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		var printWriter = response.getWriter();
		response.setContentType("text/html");
		var html = SignupPage.getSigninPage();
		printWriter.println(html);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		var printWriter = response.getWriter();
		response.setContentType("text/html");
		var name = request.getParameter("name");
		var email = request.getParameter("email");
		var password = request.getParameter("password");
		
		service.registerCustomer(name, email, password);
		printWriter.println("Registred successfully");
	}
}
