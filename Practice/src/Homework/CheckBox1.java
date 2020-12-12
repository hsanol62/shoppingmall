package Homework;


import java.awt.*;

public class CheckBox1 extends Frame {
	public CheckBox1 () {
		
		setLayout(new FlowLayout());
	Label lb = new Label ("좋아하는 계절을 선택하세요.\n");
			
	
	Checkbox cb = new Checkbox ("봄");
	Checkbox cb1 = new Checkbox("여름");
	Checkbox cb2 = new Checkbox("가을");
	Checkbox cb3 = new Checkbox("겨울");
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