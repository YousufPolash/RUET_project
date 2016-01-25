import java.applet.*;
import java.awt.*;

public class applet extends Applet {
	
	public void init(){
		setBackground(Color.yellow);
	
	}

	public void paint( Graphics g){
	
		g.setColor(Color.red);
		//g.drawString("Hello Polash", 100, 100);
		//g.drawRect(120, 130, 50, 80);
		g.fillRect(100,100 , 40, 400);
		g.fillRect(140, 100, 150, 40);
		g.fillRect(290, 100, 40, 170);
		g.fillRect(140, 270, 190, 40);
	}

}
