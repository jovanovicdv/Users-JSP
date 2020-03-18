package view;

import java.util.HashMap;
import java.util.Map;

import constants.PageConstants;
import constants.ViewConstants;

public class ViewResolver {
	private Map<String, String> pages;
	
	public ViewResolver() {
		pages = new HashMap<String, String>(){
			/**
			 * 
			 */
			private static final long serialVersionUID = -769199147032887838L;

			{
				put(ViewConstants.HOME, PageConstants.PAGE_HOME);
				put(ViewConstants.LOGIN, PageConstants.PAGE_LOGIN);
				put(ViewConstants.DEFAULT_ERROR, PageConstants.PAGE_DEFAULT_ERROR);
				
				put(ViewConstants.ADD_USER, PageConstants.PAGE_ADD_USER);
				put(ViewConstants.ALL_USER, PageConstants.PAGE_ALL_USER);
				put(ViewConstants.ONLINE_USER, PageConstants.PAGE_ONLINE_USER);
			}
			
		};
	}
	
	public String getPage(String view) {
		if (pages.containsKey(view)) {
			return pages.get(view);
		}
		return ViewConstants.DEFAULT_ERROR;
	}

}
