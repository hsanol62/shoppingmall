package Homework;

import java.awt.*;
import java.util.*;

public class Button2 extends Frame {
Button [] btn = new Button [50]; 
Label [] lab = new Label [50];

Button2 () {
	setLayout(new FlowLayout());
	for (int i=0; i<50; i++) // for�� �ڿ� ; Xxx�����ʴ´�.
	{
		btn [i] = new Button (i + "��ư" );
		add(btn[i]); //�ٽú���
		lab [i] = new Label(i + "��");
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
	public static void main(String[] args) { // {} ��� ���� ��
		new Button2();
	}
}

