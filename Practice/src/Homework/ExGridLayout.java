package Homework;

import java.awt.*;
import javax.swing.*;

public class ExGridLayout extends JFrame {
	public ExGridLayout () {
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setTitle("Grid 연습");
	this.setLayout(new GridLayout(3,3,30,30)); 
	// 3행3열,수직10간격,수평10간격으로 설정
	
	
	JButton btn [] = new JButton[9]; //다시보기
	for( int i = 0; i <9; i++){
		btn[i] = new JButton ( "버튼" + (i+1));
		this.add(btn[i]);
		setVisible(true);
		setSize(400, 400);
	}
	

}
public static void main(String [] args) {
	new ExGridLayout();
}
}