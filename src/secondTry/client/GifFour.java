package secondTry.client;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.VerticalPanel;

public class GifFour extends Composite {

	private VerticalPanel vPane = new VerticalPanel();
	
	public GifFour() {
		
		initWidget(this.vPane);
		
		Image gif = new Image("gif4.gif");
	
		this.vPane.add(gif);
	}
}
