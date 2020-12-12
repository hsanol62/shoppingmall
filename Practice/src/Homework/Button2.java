package Homework;

import java.awt.*;
import java.util.*;

public class Button2 extends Frame {
Button [] btn = new Button [50]; 
Label [] lab = new Label [50];

Button2 () {
	setLayout(new FlowLayout());
	for (int i=0; i<50; i++) // for문 뒤에 ; Xxx쓰지않는다.
	{
		btn [i] = new Button (i + "버튼" );
		add(btn[i]); //다시보기
		lab [i] = new Label(i + "라벨");
		add(lab[i]);
	
	if ( i % 2 == 1) {
		lab[i].setBackground(Color.WHITE);
		lab[i].setForeground(Color.RED);
		btn[i].setEnabled(false);
	}
	}
	setBackground(Color.PINK);
	setForeground(Color.BLUE);
	setVisible(true);
	setSize(500,500);
}
	public static void main(String[] args) { // {} 어디 쓸지 헷갈
		new Button2();
	}
}

