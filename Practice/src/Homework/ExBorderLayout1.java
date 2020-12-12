package Homework;

import java.awt.*;
import javax.swing.*;

public class ExBorderLayout1 extends JFrame {

	public ExBorderLayout1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle ("연습");
		
		
		JButton btn = new JButton("버튼1");
		this.add(btn, BorderLayout.NORTH);
		
		setSize(300, 300);
		setVisible(true);
		
		
	}

	
	
	
	public static void main(String[] args) {
		new ExBorderLayout1();
	}

}
