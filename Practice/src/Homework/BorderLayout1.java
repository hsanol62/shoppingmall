package Homework;

import java.awt.*;

import javax.swing.*;

public class BorderLayout1 extends JFrame {

public BorderLayout1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		setLayout (new BorderLayout(10,20));
		Button btn1 = new Button("巢率");
		Button btn2 = new Button("合率");
		Button btn3 = new Button("悼率");
		Button btn4 = new Button("辑率");
		Button btn5 = new Button("季磐");
		add(btn1, "North");
		add(btn2, "South");
		add(btn3, "East");
		add(btn4, "West");
		add(btn5, "Center");

		setSize(300,300);
		setVisible(true);
	}

public static void main(String[] args) {
	new BorderLayout1();
}
}


