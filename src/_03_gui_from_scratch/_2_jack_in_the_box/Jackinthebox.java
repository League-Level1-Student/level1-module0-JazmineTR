package _03_gui_from_scratch._2_jack_in_the_box;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import jdk.internal.org.jline.terminal.MouseEvent.Button;

public class Jackinthebox implements ActionListener{
	int clicked = 0;
	public void showButton() {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		  JButton button = new JButton("Surprise");
		    frame.add(button);
		    frame.pack();
		    button.addActionListener(this);
		    }


	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method
		
			clicked++;
			
System.out.println(clicked);
	if(clicked==5) {
		String jackInTheBox = "src/_03_gui_from_scratch/_2_jack_in_the_box/jackInTheBox.png";
		private void showPicture(String jackInTheBox) { 
		     try {
		          JLabel imageLabel = createLabelImage(fileName);
		          JFrame frame = new JFrame();
		          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		          frame.add(imageLabel);
		          frame.setVisible(true);
		          frame.pack();
		     } catch (Exception e) {
		          e.printStackTrace();
		     }
		}
	}
}
	}

 
	
