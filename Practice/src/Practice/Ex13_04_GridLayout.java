package Practice;
import java.awt.*;
import javax.swing.*;
public class Ex13_04_GridLayout {
	static class MyGUI extends JFrame {
		MyGUI() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle("GridLayout 연습");

			this.setLayout(new GridLayout(3, 3, 10, 10));
	
			JButton[] btn = new JButton[9];

			for (int i = 0; i < 9; i++) {//9개의 버튼배열 for반복문
				btn[i] = new JButton("버튼" + (i + 1));
				this.add(btn[i]);
			}
	
			setSize(256, 256);
			setVisible(true);
		}
	}

	public static void main(String[] args) {
		new MyGUI();
	}
}