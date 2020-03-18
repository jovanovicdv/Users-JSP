package action.impl.user;

import javax.servlet.http.HttpServletRequest;

import action.AbstractAction;
import constants.ViewConstants;
import domain.User;
import service.UserService;
import service.impl.UserServiceImpl;
import validator.Validator;
import validator.impl.UserValidator;

public class UserSaveAction extends AbstractAction {
	private final UserService userService;
	private static Validator validator = new UserValidator();

	public UserSaveAction() {
		super();
		this.userService = new UserServiceImpl();
	}

	@Override
	public String execute(HttpServletRequest request) {
		String view = ViewConstants.ALL_USER;

		String username = request.getParameter("username");
		String password = request.getParameter("password");

		try {
			User user = new User(username, password);
			validator.validateObject(user);
			try {
				userService.save(user);
				request.setAttribute("users", userService.getAll());
				request.setAttribute("message", "User is saved!");
			} catch (Exception e) {
				request.setAttribute("errorMessage", e.getMessage());
				view = ViewConstants.ADD_USER;
			}

		} catch (Exception e) {
			request.setAttribute("validationError", e.getMessage());
			view = ViewConstants.ADD_USER;
		}

		return view;
	}

}
