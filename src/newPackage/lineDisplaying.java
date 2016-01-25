package newPackage;

import java.applet.Applet;
import java.awt.Graphics;

import javax.swing.JApplet;

public class lineDisplaying extends Applet{

	public void paintComponent(Graphics g){
		g.drawString("Hello there , how are you ?", 56, 87);
	}
	public static void main(String[] args) {
	}

}
