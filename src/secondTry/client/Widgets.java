package secondTry.client;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;

public class Widgets extends Composite {

	//Panels and Widgets/features
	private VerticalPanel vPane = new VerticalPanel();
	private TextBox box1;
	private Label label1;

	public Widgets() {
		
		HorizontalPanel hPane = new HorizontalPanel(); 
		
		initWidget(hPane);

		//Adds widgets to the site
		this.label1 = new Label("SOME TITLE HERE");
		this.box1 = new TextBox();

		//Adds stuff for a button - e.g functionality
		Button button1 = new Button("Kittens rule the internet!");
		button1.addClickHandler(new Buttons());

		//Adds stuff for vPane
		vPane.add(this.label1);
		vPane.add(this.box1);
		vPane.add(button1);

		//Adds stuff for hPane
		hPane.add(vPane);
		
		//New Widgets
		WidgetsTwo widgetTwo = new WidgetsTwo();
		vPane.add(widgetTwo);

	}

	private class Buttons implements ClickHandler {

		@Override
		public void onClick(ClickEvent event) {

			String inputText = box1.getText();
			label1.setText(inputText);

		}
	}

}
