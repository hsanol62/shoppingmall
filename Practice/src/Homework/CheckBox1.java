package Homework;


import java.awt.*;

public class CheckBox1 extends Frame {
	public CheckBox1 () {
		
		setLayout(new FlowLayout());
	Label lb = new Label ("�����ϴ� ������ �����ϼ���.\n");
			
	
	Checkbox cb = new Checkbox ("��");
	Checkbox cb1 = new Checkbox("����");
	Checkbox cb2 = new Checkbox("����");
	Checkbox cb3 = new Checkbox("�ܿ�");
	add(lb);
	add(cb);
	add(cb1);
	add(cb2);
	add(cb3);
	setSize (300, 300);
	setVisible(true);
	
	
	
	

}
	public static void main(String []args) {
	new CheckBox1();
}
}