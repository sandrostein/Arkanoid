import java.awt.*;
import javax.swing.*;

import Arkanoid.*;

public class Main {
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("Arkanoid");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout());
		frame.setSize(1280, 720);
		frame.setLocationRelativeTo(null);
		
		Arkanoid game = new Arkanoid(1280, 720);
		frame.add(game, BorderLayout.CENTER);
		
		frame.setVisible(true);
	}
	
}
