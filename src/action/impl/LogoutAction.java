package action.impl;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import action.AbstractAction;
import constants.ViewConstants;
import domain.User;

public class LogoutAction extends AbstractAction {

	@SuppressWarnings("unchecked")
	@Override
	public String execute(HttpServletRequest request) {
		((List<User>)request.getServletContext().getAttribute("onlineUsers")).remove(request.getSession().getAttribute("username"));
		request.getSession().invalidate();
		return ViewConstants.LOGIN;
	}

	

}
