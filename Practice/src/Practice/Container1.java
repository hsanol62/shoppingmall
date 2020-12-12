package Practice;

import javax.swing.*;
import java.awt.*;

public class Container1 {
	public static void main(String []args) {
		JFrame frame = new JFrame("Label");
		Container c = frame.getContentPane();
		
		JLabel label1 = new JLabel ("CENTER", SwingConstants.CENTER);
		
		c.setLayout(new BorderLayout());
		c.add(label1, BorderLayout.CENTER);
		
		
		frame.setLocation(500, 400);
		  frame.setPreferredSize(new Dimension(400, 340));
		  frame.pack();
		  frame.setVisible(true);
		  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
}