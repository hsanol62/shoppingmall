package Homework;

import java.awt.*;
public class Checkbox2 extends Frame {
	public Checkbox2 () {
setLayout(new FlowLayout()); 
	Label lb = new Label("���ÿ�.");
	
	CheckboxGroup cbg = new CheckboxGroup();
	Checkbox cb = new Checkbox("��", cbg,true ); //cbg,true �߰����ϴϱ� ���׶�� �ȵ�.
	Checkbox cb1 = new Checkbox("����", cbg, true);
	
	add(lb);
	add(cb);
	add(cb1);
	
	setSize(300, 300);
	setVisible(true);
	
	
}
public static void main (String []args) {
new Checkbox2();
}
}