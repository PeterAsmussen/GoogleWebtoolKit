package secondTry.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */

public class GWTProjectTwo implements EntryPoint {

	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad() {
		
		Widgets widget = new Widgets();
		
		MainView main = new MainView();
		
		
		//Root panels
		RootPanel.get().add(main);
		RootPanel.get().add(widget);		
	}
}


