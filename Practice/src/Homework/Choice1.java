package Homework;

import java.awt.*;

public class Choice1 extends Frame {
	public Choice1() { //�ڲ� �����
setLayout(new FlowLayout());
Label lb = new Label("�����ϴ� ������ ���ÿ�.");
Choice c = new Choice();
c.add("������");
c.add("����ƾ");
c.add("BTS");
add(c);
add(lb);
setSize(300, 300);
setVisible(true);


}
public static void main (String []args) {
	new Choice1();
}
}
