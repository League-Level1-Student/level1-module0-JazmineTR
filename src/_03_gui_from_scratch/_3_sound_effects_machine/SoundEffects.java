package _03_gui_from_scratch._3_sound_effects_machine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JFrame;

public class SoundEffects implements ActionListener {
	public void showButton() {
		JFrame frame = new JFrame();
		JPanel viola = new JPanel();
		frame.setVisible(true);
		  JButton button = new JButton("Roar");
		    viola.add(button);
		    frame.add(viola);
		    frame.pack();
		    button.addActionListener(this);
}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
