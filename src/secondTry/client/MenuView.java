package secondTry.client;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HorizontalPanel;

public class MenuView extends Composite {

	private HorizontalPanel hPane = new HorizontalPanel();
	private MainView main;

	public MenuView(MainView main){

		initWidget(this.hPane);
		this.main = main;

		Button gifOne = new Button("First kitty-gif");
		this.hPane.add(gifOne);	
		gifOne.addClickHandler(new Gif1Click());

		Button gifTwo = new Button("Second kitty-gif");
		this.hPane.add(gifTwo);	
		gifTwo.addClickHandler(new Gif2Click());

		Button gifThree = new Button("Third kitty-gif");
		this.hPane.add(gifThree);
		gifThree.addClickHandler(new Gif3Click());

		Button gifFour = new Button("Fourth kitty-gif");
		this.hPane.add(gifFour);
		gifFour.addClickHandler(new Gif4Click());


	}

	private class Gif1Click implements ClickHandler{

		@Override
		public void onClick(ClickEvent event) {
			main.openGif1();
		}
	}

	private class Gif2Click implements ClickHandler{

		@Override
		public void onClick(ClickEvent event) {
			main.openGif2();
		}
	}

	private class Gif3Click implements ClickHandler{

		@Override
		public void onClick(ClickEvent event) {
			main.openGif3();
		}
	}

	private class Gif4Click implements ClickHandler{

		@Override
		public void onClick(ClickEvent event) {
			main.openGif4();
		}
	}
}
