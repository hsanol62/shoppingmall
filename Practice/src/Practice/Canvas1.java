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
		add("North", c1);// �������� C1������ ������ּ���~!
		setVisible(true); //â�� ȭ�鿡 ��Ÿ�������� ����:�����ּ���~!
	}
	public static void main(String[] args) {
		new Canvas1("ĵ�ٽ�");
	}
}
