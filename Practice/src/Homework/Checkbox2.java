package Homework;

import java.awt.*;
public class Checkbox2 extends Frame {
	public Checkbox2 () {
setLayout(new FlowLayout()); 
	Label lb = new Label("고르시오.");
	
	CheckboxGroup cbg = new CheckboxGroup();
	Checkbox cb = new Checkbox("봄", cbg,true ); //cbg,true 추가안하니까 동그라미 안됨.
	Checkbox cb1 = new Checkbox("여름", cbg, true);
	
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