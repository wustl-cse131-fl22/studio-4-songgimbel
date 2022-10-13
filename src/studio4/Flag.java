package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		
		StdDraw.setPenColor(140, 150, 225);
		StdDraw.filledRectangle(0.5, 0.5, 0.5, 0.3);
		
		StdDraw.setPenColor(225, 138, 20);
		StdDraw.filledCircle(0.5, 0.5, 0.2);
		
		StdDraw.setPenColor(225, 165, 200);
		StdDraw.filledCircle(0.5, 0.5, 0.1);
		
		StdDraw.setPenColor(170, 225, 170);
		StdDraw.filledRectangle(0.5, 0.25, 0.5, 0.05);
	}
}