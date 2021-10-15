package _03_gui_from_scratch._4_cuteness_tv;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class CutenessTV implements ActionListener {
	public void showButton() {
		JFrame frame = new JFrame();
		
		frame.setVisible(true);
		  JButton button = new JButton();
		    frame.add(button);
		    frame.pack();
		    button.addActionListener((ActionListener) this);

}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
