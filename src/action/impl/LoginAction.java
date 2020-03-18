package action.impl;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import action.AbstractAction;
import constants.ViewConstants;
import domain.User;
import validator.Validator;
import validator.impl.UserValidator;

public class LoginAction extends AbstractAction {
	private static Validator validator = new UserValidator();
	

	@SuppressWarnings("unchecked")
	@Override
	public String execute(HttpServletRequest request) {
		String page = ViewConstants.LOGIN;
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		try {
			User user = new User(username, password);
			validator.validateObject(user);
			
			
			List<User> users = (List<User>) request.getServletContext().getAttribute("users");
			if (users.contains(user)) {
				String token = String.valueOf(Math.random());
				HttpSession session = request.getSession(true);
				session.setAttribute("token", token);
				session.setAttribute("username", user.getUsername());
				((List<String>)request.getServletContext().getAttribute("onlineUsers")).add(user.getUsername());
				
				page = ViewConstants.HOME;
			} else {
				request.setAttribute("validationError", "The user doesn't exists!");
			}
		} catch (Exception e) {
			System.out.println("exception");

			request.setAttribute("validationError", e.getMessage());

		}
		return page;

	}

}
