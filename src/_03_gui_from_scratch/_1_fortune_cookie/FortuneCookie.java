package _03_gui_from_scratch._1_fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.print.attribute.standard.JobKOctetsProcessed;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class FortuneCookie implements ActionListener {
	public void showButton() {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		  JButton button = new JButton();
		    frame.add(button);
		    frame.pack();
		    button.addActionListener(this);
		 
		  
	
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		 int rand = new Random().nextInt(5);
		  if(rand == 1) {
			  JOptionPane.showMessageDialog(null,"You will be rewarded in the next 2 week." );
		  }
		  else if(rand==2) {
			  JOptionPane.showMessageDialog(null, "The fortune you seek is in a different one.");
		  }
		  else if(rand==3) {
			  JOptionPane.showMessageDialog(null, "Be careful on Tuesday.");
		  }
		  else if(rand==4) {
			  JOptionPane.showMessageDialog(null, "Do a good deed today.");
		  }
		  else if(rand==5) {
			  JOptionPane.showMessageDialog(null, "Good fortune will be yours.");
		  }
		    }
	}

