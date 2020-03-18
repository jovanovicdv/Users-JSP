package action.impl.user;

import javax.servlet.http.HttpServletRequest;

import action.AbstractAction;
import constants.ViewConstants;
import service.UserService;
import service.impl.UserServiceImpl;

public class UserAllAction extends AbstractAction {
	private final UserService userService;

	public UserAllAction() {
		super();
		this.userService = new UserServiceImpl();
	}

	@Override
	public String execute(HttpServletRequest request) {

		request.setAttribute("users", userService.getAll());
		return ViewConstants.ALL_USER;
	}
}
