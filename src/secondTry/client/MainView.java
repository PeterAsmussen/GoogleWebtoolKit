package secondTry.client;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.VerticalPanel;

public class MainView extends Composite {

	private VerticalPanel vPane = new VerticalPanel();
	private VerticalPanel contentPane;
	
	public MainView(){
	
		initWidget(this.vPane);
		
		MenuView menu = new MenuView(this);
		this.vPane.add(menu);
		
		this.contentPane = new VerticalPanel();
		this.vPane.add(contentPane);
		
	}

	public void openGif1() {
		this.contentPane.clear();
		GifOne gif1 = new GifOne();
		this.contentPane.add(gif1);
	}

	public void openGif2() {
		this.contentPane.clear();
		GifTwo gif2 = new GifTwo();
		this.contentPane.add(gif2);
	}

	public void openGif3() {
		this.contentPane.clear();
		GifThree gif3 = new GifThree();
		this.contentPane.add(gif3);
	}

	public void openGif4() {
		this.contentPane.clear();
		GifFour gif4 = new GifFour();
		this.contentPane.add(gif4);
	}
}
