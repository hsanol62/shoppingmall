package Homework;

import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

@SuppressWarnings("serial")
public  class Calculator1 extends JFrame{

	private JPanel panel;
	private JTextField display;
	private JButton[] buttons;
	private String [] labels =  {"Backspace", "", "", "CE", "C", "7", "8", "9", "/", "sqrt", "4", "5", "6", "x", "%", "1", "2", "3", "-", "1/x", "0", "-/+", ".", "+", "="};
	private double result = 0;
	private String operator = "=";
	private boolean startOfNumber = true;
	public Calculator1() {
		try {

		    UIManager.setLookAndFeel( UIManager.getCrossPlatformLookAndFeelClassName() );

		 } catch (Exception e) {

		            e.printStackTrace();

		 }
		JTextField field = new JTextField(35);
		panel = new JPanel();
		field.setText("0,0");
		field.setEnabled(false);
		//display.setEnabled(true);
			
		panel.setLayout(new GridLayout(0,5,3,3));
		buttons = new JButton[25];
		int index = 0;
		for (int rows = 0; rows<5; rows++) {
			for(int cols = 0; cols <5; cols++ ) {
				
				buttons[index] = new JButton(labels[index]); 
				
				if(cols >=3)
					buttons[index].setForeground(Color.red);
				
				else {
					buttons[index].setForeground(Color.blue);
				}
				buttons[index].setBackground(Color.yellow);
				panel.add(buttons[index]); //ActionListener ����
				index++;
			}
		}
		Component dispaly = null; //�������� �߰�
		add(dispaly, BorderLayout.NORTH);
		add(panel, BorderLayout.CENTER);
		setVisible(true);
		pack(); //?
		
	}
	public void actionPerformed(ActionEvent e) { //didn't work, changed name,add 1
		String command = e.getActionCommand();
		if(command.charAt(0) == 'C') { //command.charAt?
			startOfNumber = true;
					result = 0;
					operator = "="; //Syntax error on token "operator" AssignmentOperator expected after this token = '=' �߰�
					display.setText("0.0");
		} else if(command.charAt(0) >= '0' && command.charAt(0) <= '9' || command.equals(".")) {
			if(startOfNumber == true)
				display.setText(command);
			else
				display.setText(display.getText() + command);
			startOfNumber = false;
		} else {
			if(startOfNumber) {
				if(command.equals("-")) {
					display.setText(command);
					startOfNumber = false;
				}
				else 
					operator = command; 
			}	else {
				double x = Double.parseDouble(display.getText());
				calculate(x);
				operator = command;
				startOfNumber = true; 
				}
			}
		}
			private void calculate (double n ) { //
				if (operator.equals("+"))
					result += n;
				
				else if (operator.equals("-"))
					result -= n;
				else if (operator.equals("*"))
					result *= n;
				else if(operator.equals("/"))
					result /= n;
				else if(operator.equals("="))
					result = n;
				display.setText("" + result);
			}
		public static void main(String [] args) {
			Calculator1 s = new Calculator1();
		}
}
