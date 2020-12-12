package Homework;

import java.awt.*;

public class Canvas1 extends Frame {
	Canvas1(String str) {
	setLayout(new FlowLayout());
	Canvas c1 = new Canvas ();
	c1.setBackground(Color.RED);
	c1.setSize(100, 100);
	setSize(200,200);
	setBackground(Color.BLUE);
	add("CENTER", c1);
	setVisible(true);
	
	
	}
	
	
	
	
	
	public static void main(String[] args) {
		new Canvas1("Äµ¹ö½º");
	}

}
