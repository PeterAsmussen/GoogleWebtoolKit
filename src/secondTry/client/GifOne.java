package secondTry.client;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.VerticalPanel;

public class GifOne extends Composite {

	private VerticalPanel vPane = new VerticalPanel();
	
	public GifOne() {
		
		initWidget(this.vPane);
		
		Image gif = new Image("tumblr_ndel3b4S0Y1qaaccio1_500.gif");
	
		this.vPane.add(gif);
	}
}
