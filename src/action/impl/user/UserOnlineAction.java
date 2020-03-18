package action.impl.user;

import javax.servlet.http.HttpServletRequest;

import action.AbstractAction;
import constants.ViewConstants;
import service.UserService;
import service.impl.UserServiceImpl;

public class UserOnlineAction extends AbstractAction {

	private final UserService userService;

	public UserOnlineAction() {
		super();
		this.userService = new UserServiceImpl();
	}

	@Override
	public String execute(HttpServletRequest request) {

		request.setAttribute("onlineUsers", userService.getAllOnline());
		return ViewConstants.ONLINE_USER;
	}

}
