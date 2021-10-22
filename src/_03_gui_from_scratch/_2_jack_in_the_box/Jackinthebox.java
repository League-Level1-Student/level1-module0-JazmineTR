package _03_gui_from_scratch._2_jack_in_the_box;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

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
		String jackInTheBox = "jackInTheBox.png";
		showPicture(jackInTheBox);
	}
	}
	private void showPicture(String jackInTheBox) { 
	     try {
	          JLabel imageLabel = createLabelImage(jackInTheBox);
	          JFrame frame = new JFrame();
	          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	          frame.add(imageLabel);
	          frame.setVisible(true);
	          frame.pack();
	     } catch (Exception e) {
	          e.printStackTrace();
	     }
}
	private JLabel createLabelImage(String fileName) {
	     try {
	          URL imageURL = getClass().getResource(fileName);
	          if (imageURL == null) {
	               System.err.println("Could not find image " + fileName);
	               return new JLabel();
	          } else {
	               Icon icon = new ImageIcon(imageURL);
	               JLabel imageLabel = new JLabel(icon);
	               return imageLabel;
	          }
	     } catch (Exception e) {
	          System.err.println("Could not find image " + fileName);
	          return new JLabel();
	     }

	}
	}

 
	
