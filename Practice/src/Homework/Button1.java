package Homework;

import java.awt.*;
import javax.swing.*;

public class Button1 extends Frame { //JFrame���� �ߴ��� background ���� X
	Button1 () { // �־ �ǰ� ���
		setTitle("���");
		setLayout(new FlowLayout());
	
 Button scissor = new Button ("����");
Button rock =  new Button ("����");
Button paper = new Button ("��");


add(scissor);
add(rock);
add(paper);

scissor.setBackground(Color.CYAN);
rock.setForeground(Color.RED);
paper.setEnabled(false);

setBackground(Color.PINK);
setForeground(Color.BLUE);

setSize(200, 300);
setVisible (true); 
	}
	public static void main (String[] args) {
		new Button1();
	
	}
}
