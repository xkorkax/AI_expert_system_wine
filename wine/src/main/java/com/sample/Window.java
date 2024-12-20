package com.sample;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Image;

public class Window {
	
	public Window(){}
	
	static ImageIcon icon = new ImageIcon("wine.png");
	
	static Image scaledImage = icon.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH); 
    static ImageIcon scaledIcon = new ImageIcon(scaledImage); 
	
	
	public static String askUser(String question, String[] available_answers) {
		int n = JOptionPane.showOptionDialog(
				null,								//parent
				question,							//question
				"Choose bootle of wine",			//window title
				JOptionPane.YES_NO_OPTION,			//option type
				JOptionPane.QUESTION_MESSAGE,		//message type
				scaledIcon,     					//icon
				available_answers,  				//options
				null								//initial value
			); 
			if (n<0 || n >= available_answers.length)
				return "User interaption";
			else 
				return available_answers[n];
		}			
}