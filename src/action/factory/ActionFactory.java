package action.factory;

import action.AbstractAction;
import action.impl.HomeAction;
import action.impl.LoginAction;
import action.impl.LogoutAction;
import action.impl.user.UserAddAction;
import action.impl.user.UserAllAction;
import action.impl.user.UserOnlineAction;
import action.impl.user.UserSaveAction;

public class ActionFactory {
	public static AbstractAction createActionFactory(String actionName) {
		AbstractAction action =null;
		
		if(actionName.equalsIgnoreCase("/login")) {
			action = new LoginAction();
		}
		
		if(actionName.equalsIgnoreCase("/logout")) {
			action = new LogoutAction();
		}
		
		if(actionName.equalsIgnoreCase("/home")) {
			action = new HomeAction();
		}
		
		if(actionName.equalsIgnoreCase("/user/add")) {
			action = new UserAddAction();
		}
		
		if(actionName.equalsIgnoreCase("/user/all")) {
			action = new UserAllAction();
		}
		
		if(actionName.equalsIgnoreCase("/user/save")) {
			action = new UserSaveAction();
		}
		
		if(actionName.equalsIgnoreCase("/user/online")) {
			action = new UserOnlineAction();
		}
		
		
		return action;
	}

}
