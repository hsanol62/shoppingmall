package Practice;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Frame;

public class Canvas1 extends Frame {
	Canvas1(String str) {
		Canvas c1 = new Canvas();
		c1.setBackground(Color.RED);
		c1.setSize(200, 100);
		setSize(200, 200);
		setBackground(Color.BLUE);
		add("North", c1);// 위쪽으로 C1생성을 만들어주세요~!
		setVisible(true); //창을 화면에 나타낼것인지 여부:보여주세요~!
	}
	public static void main(String[] args) {
		new Canvas1("캔바스");
	}
}
