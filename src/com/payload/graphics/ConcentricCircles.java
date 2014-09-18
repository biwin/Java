package com.payload.graphics;


import javax.swing.*;
import java.awt.*;

public class ConcentricCircles extends JApplet{
	
	public void paint(Graphics graphics){
		final int x = 0, y = 0;
		graphics.setColor(Color.BLACK);
		graphics.fillOval(x,y,260,260);
		graphics.setColor(Color.WHITE);
		graphics.fillOval((x+30),(y+30),200,200);
	}

}
