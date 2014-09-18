package com.payload.graphics;


import javax.swing.*;
import java.awt.*;
import java.awt.Color;

public class SquareAndCircle  extends JApplet{
	
	public void paint(Graphics graphics){
		final int x = 0, y = 0, size = 350;
		graphics.setColor(Color.YELLOW);
		graphics.fillRect(x, y, size, size);

		graphics.setColor(Color.GREEN);
		graphics.fillOval(x,(y + 20) ,size,(size-20));

		graphics.setColor(Color.RED);
		graphics.fillOval(x,(y + 40),size,(size-40));

		graphics.setColor(Color.CYAN);
		graphics.fillOval(x,(y + 60),size,(size-60));

		graphics.setColor(Color.gray);
		graphics.fillOval(x,(y + 80),size,(size-80));
	}

}
