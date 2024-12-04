package password_generator.using.swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TempConvertorMain implements ActionListener {
	String x, y;
	static UserInterface user;
	static Operations_Temp opera;

	public static void main(String args[]) {
		user = new UserInterface();
		opera = new Operations_Temp();
	}
	//this is the first issue raise uding the github issue

	@Override
	public void actionPerformed(ActionEvent e) {
		x = (String) user.list1.getSelectedItem();
		y = (String) user.list2.getSelectedItem();
		// TODO Auto-generated method stub
		if (e.getSource() == user.convert) {
			String a = user.textfrom.getText();
			String b = user.textto.getText();
			if (x == "F" && y == "F")
				user.textto.setText(a);
			else if (x == "K" && y == "K")
				user.textto.setText(a);
			else if (x == "C" && y == "C")
				user.textto.setText(a);
			else if (x == "K" && y == "C")
				user.textto.setText(opera.Kelvin_Cel(a, b));
			else if (x == "K" && y == "F")
				user.textto.setText(opera.Kelvin_Fer(a, b));
			else if (x == "F" && y == "C")
				user.textto.setText(opera.Ferhnite_Cel(a, b));
			else if (x == "F" && y == "K")
				user.textto.setText(opera.Ferhnite_Kel(a, b));
			else if (x == "C" && y == "F")
				user.textto.setText(opera.Cel_Kelvin(a, b));
			else if (x == "C" && y == "K")
				user.textto.setText(opera.Cel_Fer(a, b));

		}
	}
}
