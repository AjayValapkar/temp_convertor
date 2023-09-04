package password_generator.using.swing;

import javax.swing.*;

class UserInterface {
	JFrame j;
	JLabel label1, label2, label3, label4;
	JComboBox<?> list1, list2;
	JTextField textfrom, textto;
	JButton convert;
	JButton clear;

	UserInterface() {
		String units[] = { "F", "K", "C" };
		String to_unit[] = { "F", "K", "C" };
		j = new JFrame();
		JLabel label1 = new JLabel();
		this.label1 = label1;
		j.add(label1);
		label1.setBounds(40, 20, 150, 20);
		label1.setText("Unit From");

		JLabel label2 = new JLabel();
		j.add(label2);
		label2.setBounds(40, 70, 150, 20);
		label2.setText("Unit to");

		JLabel label3 = new JLabel();
		j.add(label3);
		label3.setBounds(180, 20, 150, 20);
		label3.setText("Enter Value");

		JLabel label4 = new JLabel();
		j.add(label4);
		label4.setBounds(180, 70, 150, 20);
		label4.setText("Converted Value");

		JComboBox list1 = new JComboBox(units);
		this.list1 = list1;
		j.add(list1);
		list1.setBounds(40, 45, 120, 20);

		JComboBox list2 = new JComboBox(to_unit);
		this.list2 = list2;
		j.add(list2);
		list2.setBounds(40, 95, 120, 20);

		JTextField textfrom = new JTextField();
		this.textfrom = textfrom;
		j.add(textfrom);
		textfrom.setBounds(180, 45, 120, 20);

		JTextField textto = new JTextField();
		this.textto = textto;
		j.add(textto);
		textto.setBounds(180, 95, 120, 20);

		JButton convert = new JButton("click");
		this.convert = convert;
		j.add(convert);
		convert.setBounds(125, 140, 100, 30);
		convert.setText("Convert");
		convert.addActionListener(new TempConvertorMain());

		JButton clear = new JButton("click");
		this.clear = clear;
		j.add(clear);
		clear.setBounds(125, 140, 100, 30);
		clear.setText("Clear");
		clear.addActionListener(new TempConvertorMain());

		j.setSize(400, 300);
		j.setLayout(null);
		j.setVisible(true);

	}

	public void admin_dash() {

		System.out.println("Welcome");
		JFrame admin_dash = new JFrame();
		admin_dash.setSize(800, 600);
		admin_dash.setLayout(null);
		admin_dash.setVisible(true);
	}
}
