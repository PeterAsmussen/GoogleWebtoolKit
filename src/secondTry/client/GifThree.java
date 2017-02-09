package secondTry.client;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.VerticalPanel;

public class GifThree extends Composite {

	private VerticalPanel vPane = new VerticalPanel();
	
	public GifThree() {
		
		initWidget(this.vPane);
		
		Image gif = new Image("gif3.gif");
	
		this.vPane.add(gif);
	}
}
