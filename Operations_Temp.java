package password_generator.using.swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Operations_Temp {
	String from;
	String to;

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String Kelvin_Cel(String from, String to) {
		String result = " ";
		try {
			double res = (Float.valueOf(from) - 273.15);
			result = String.valueOf(res);

		} catch (Exception e) {
			System.out.println(e);
		}
		return result;
	}

	public String Kelvin_Fer(String from, String to) {
		String result = " ";
		try {
			double res = ((Float.valueOf(from) - 273.15) * 9 / 5 + 32);
			result = String.valueOf(res);

		} catch (Exception e) {
			System.out.println(e);
		}
		return result;
	}

	public String Ferhnite_Cel(String from, String to) {
		String result = " ";
		try {
			double res = ((Float.valueOf(from) - 32) * 5 / 9);
			result = String.valueOf(res);

		} catch (Exception e) {
			System.out.println(e);
		}
		return result;
	}

	public String Ferhnite_Kel(String from, String to) {
		String result = " ";
		try {
			double res = ((Float.valueOf(from) - 32) * 5 / 9 + 273.15);
			result = String.valueOf(res);

		} catch (Exception e) {
			System.out.println(e);
		}
		return result;
	}

	public String Cel_Kelvin(String from, String to) {
		String result = " ";
		try {
			double res = Float.valueOf(from) + 273.15;
			result = String.valueOf(res);

		} catch (Exception e) {
			System.out.println(e);
		}
		return result;
	}

	public String Cel_Fer(String from, String to) {
		String result = " ";
		try {
			float res = ((Float.valueOf(from) * 9 / 5) + 32);
			result = String.valueOf(res);

		} catch (Exception e) {
			System.out.println(e);
		}
		return result;
	}

}
