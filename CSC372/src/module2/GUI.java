package module2;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUI {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		final int F_WIDTH = 750;
		final int F_HEIGHT = 750;
		frame.setSize(F_WIDTH, F_HEIGHT);
		frame.setTitle("Bank Balance");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		JButton button1 = new JButton("button");
		
		JPanel panel = new JPanel();
		panel.add(button1);
		panel.setBackground(Color.blue);
		frame.add(panel);
		frame.setVisible(true);
		
	}
}
