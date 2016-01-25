import java.applet.*;
import java.awt.*;

public class graphics_drawing extends Applet{

public void init(){
	setBackground(Color.red);
}
	public void paint(Graphics g){
		g.setColor(Color.blue);
		g.drawLine(50, 50, 150, 150);
		g.drawArc(170, 180, 70, 50, 70, 80);
		g.drawOval(190, 190, 60, 30);
		g.fillOval(190,  190,  80, 50);
		
	}

}
