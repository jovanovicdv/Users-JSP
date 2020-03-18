package action.impl;

import javax.servlet.http.HttpServletRequest;

import action.AbstractAction;
import constants.ViewConstants;

public class HomeAction extends AbstractAction {

	@Override
	public String execute(HttpServletRequest request) {
		return ViewConstants.HOME;
	}

}
