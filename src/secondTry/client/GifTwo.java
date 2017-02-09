package secondTry.client;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.VerticalPanel;

public class GifTwo extends Composite {

	private VerticalPanel vPane = new VerticalPanel();
	
	public GifTwo() {
		
		initWidget(this.vPane);
		
		Image gif = new Image("gif2.gif");
	
		this.vPane.add(gif);
	}
}
