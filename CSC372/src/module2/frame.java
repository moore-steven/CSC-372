package module2;

import javax.swing.JFrame;

public class frame {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		final int F_WIDTH = 750;
		final int F_HEIGHT = 750;
		frame.setSize(F_WIDTH, F_HEIGHT);
		frame.setTitle("Frame");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
