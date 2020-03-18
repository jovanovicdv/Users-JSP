package contoller;

import javax.servlet.http.HttpServletRequest;

import action.AbstractAction;
import action.factory.ActionFactory;
import constants.ViewConstants;
import database.Database;

public class ApplicationController {

	public String processRequest(String pathInfo, HttpServletRequest request) {
		
		String page = ViewConstants.DEFAULT_ERROR;
		AbstractAction action = ActionFactory.createActionFactory(pathInfo);
		
		if (action != null) {
			Database.setServletContext(request.getServletContext());
			page = action.execute(request);
		}else {
			request.setAttribute("error", "Action " + pathInfo + " is not mapped.");
		}
		return page;
	}

}
