package _02_gui_with_help._2_photo_quiz;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2021
 *    Level 1
 */

import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	

	public void run() {

		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
		// This will make sure the program exits when you close the window
		quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 1. find an image on the internet, and put its URL in a String
		// variable (from your browser, right click on the image, and select
		// “Copy Image Address” )
String lady = "https://static.wikia.nocookie.net/kimetsu-no-yaiba/images/1/19/Tamayo_anime.png/revision/latest?cb=20191130193827";
		// 2. create a variable of type "Component" that will hold your imageComponent
Component comp = null;
		// 3. use the "createImage()" method below to initialize your Component
createImage(lady);
		// 4. add the image to the quiz window
quizWindow.add(lady, comp);
		// 5. call the pack() method on the quiz window
quizWindow.pack();
		// 6. ask a question that relates to the image
String slayer = JOptionPane.showInputDialog(comp,"Is this character from Demon Slayer?");
		// 7. print "CORRECT" if the user gave the right answer
if(slayer.equalsIgnoreCase("yes")) {
	JOptionPane.showMessageDialog(comp, "CORRECT!");
}
else {
	JOptionPane.showMessageDialog(comp, "INCORRECT");
}
		// 8. print "INCORRECT" if the answer is wrong
quizWindow.remove(comp);
		// 9. remove the component from the quiz window (you may not see the
		// effect of this until step 12)
String airi = "https://i.pinimg.com/originals/d2/66/02/d266027fb3dafad1ba1f4588e48fd175.jpg";
		// 10. find another image and create it (might take more than one line
		// of code)
createImage(airi);
		// 11. add the second image to the quiz window
quizWindow.add(airi,comp);
		// 12. pack the quiz window
quizWindow.pack();
		// 13. ask another question

		// 14+ check answer, say if correct or incorrect, etc.

	}

	private Component createImage(String imageUrl) {
		JLabel imageLabel = new JLabel();
		URL url;
		try {
			url = new URL(imageUrl);
			Icon icon = new ImageIcon(url);
			imageLabel.setIcon(icon);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null, "I can't find your image!!");
		}
		
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}
