package Homework;

import java.awt.*;
import javax.swing.*;

public class Button1 extends Frame { //JFrame으로 했더니 background 색이 X
	Button1 () { // 있어도 되고 없어도
		setTitle("대박");
		setLayout(new FlowLayout());
	
 Button scissor = new Button ("가위");
Button rock =  new Button ("바위");
Button paper = new Button ("보");


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
