package Homework;

import java.awt.*;

public class Choice1 extends Frame {
	public Choice1() { //자꾸 까먹음
setLayout(new FlowLayout());
Label lb = new Label("좋아하는 가수를 고르시오.");
Choice c = new Choice();
c.add("아이유");
c.add("세븐틴");
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
