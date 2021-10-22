package _03_gui_from_scratch._4_cuteness_tv;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CutenessTV implements ActionListener {
	JButton button = new JButton("Duck");
	  JButton bark = new JButton("Frog");
	  JButton ribbit = new JButton("Unicorn");
	public void showButton() {
		JFrame frame = new JFrame();
		JPanel viola = new JPanel();
		frame.setVisible(true);
		    viola.add(button);
		    viola.add(bark);
		    viola.add(ribbit);
		    frame.add(viola);
		    frame.pack();
		    button.addActionListener(this);
		    bark.addActionListener(this);
		    ribbit.addActionListener(this);
}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()== button) {
			
		}
		if(e.getSource()== bark) {
			
		}
		if(e.getSource()== ribbit) {
			
		}
	}
	void playVideo(String videoID) {
	     
	     // Workaround for Linux because "Desktop.getDesktop().browse()" doesn't
	     //work on some Linux implementations
	     try {
	     if (System.getProperty("os.name").toLowerCase().contains("linux")) {
	     if (Runtime.getRuntime().exec(new String[] {
	      "which", "xdg- open" }).getInputStream().read() != -1) {
	     Runtime.getRuntime().exec(new String[] { "xdg-open", videoID });
	     }
	     } else {
	          URI uri = new URI(videoID);
	          java.awt.Desktop.getDesktop().browse(uri);
	     }      } catch (Exception e) {
	          e.printStackTrace();
	     }
	}
	void showDucks() {
	     playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
	}

	void showFrog() {
	     playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
	}

	void showFluffyUnicorns() {
	     playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
	}
	
}
