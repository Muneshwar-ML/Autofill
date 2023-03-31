package com.autotype;

import java.awt.Robot;
import java.awt.AWTException;
import java.awt.event.KeyEvent;
import java.io.IOException;
import javax.swing.JOptionPane;

import org.omg.SendingContext.RunTime;


public class Type {

	public static void main(String[] args) {

		try {



			Thread.sleep(4000);

			Robot robot = new Robot();
			int key = KeyEvent.getExtendedKeyCodeForChar(105);

			int i=0,j =0;


			while(j<500) {


				while(i<250) {
					robot.keyPress(key);
					robot.keyRelease(key);
					Thread.sleep(1);
					i++;
				}
				robot.keyPress(9);
				robot.keyRelease(9);
				j++;
				i=0;
			}
			JOptionPane.showMessageDialog(null, "250 i's for tabable text fields has been inserted. \n\n"
					+ "Please verify and please fill if more than 250 characters are required. \n\n", 
					"AutoFill", JOptionPane.WARNING_MESSAGE);
		}



		catch(Exception e) {
			System.out.println(e);
		}

	}



}


