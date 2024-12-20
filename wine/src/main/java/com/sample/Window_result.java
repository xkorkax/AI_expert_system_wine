package com.sample;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Window_result {
	
	public Window_result(){}
	
	static ImageIcon icon = new ImageIcon("wine2.png");
	
	static Image scaledImage = icon.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH); 
    static ImageIcon scaledIcon = new ImageIcon(scaledImage); 
	
	
	
	 public static void showMessage(String message) {
	        JOptionPane.showMessageDialog(
	                null,                        		//parent
	                message,                     		//result
	                "Result",               	 		//window title
	                JOptionPane.INFORMATION_MESSAGE, 	//message type
	                scaledIcon 			 				//icon
	        );
	    }
}