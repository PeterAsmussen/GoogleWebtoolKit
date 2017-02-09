package secondTry.client;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;

public class WidgetsTwo extends Composite {

	private HorizontalPanel hPane2 = new HorizontalPanel();
	
	public WidgetsTwo() {
	
		initWidget(this.hPane2);
		FlexTable ft = new FlexTable();
	
		//Adds labels
		Label label1 = new Label("This");
		Label label2 = new Label("is");
		Label label3 = new Label("Kitten");
		Label label4 = new Label("Town");
		
		//Adds the labels to the Flex Table
		ft.setWidget(0, 0, label1);
		ft.setWidget(0, 1, label2);
		ft.setWidget(1, 0, label3); 
		ft.setWidget(1, 1, label4);
		
		hPane2.add(ft);
	}
}
