package Homework;

import java.awt.*;
import javax.swing.*;

public class ExGridLayout extends JFrame {
	public ExGridLayout () {
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setTitle("Grid ����");
	this.setLayout(new GridLayout(3,3,30,30)); 
	// 3��3��,����10����,����10�������� ����
	
	
	JButton btn [] = new JButton[9]; //�ٽú���
	for( int i = 0; i <9; i++){
		btn[i] = new JButton ( "��ư" + (i+1));
		this.add(btn[i]);
		setVisible(true);
		setSize(400, 400);
	}
	

}
public static void main(String [] args) {
	new ExGridLayout();
}
}