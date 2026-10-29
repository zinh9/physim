package io.github.zinh9.physim;

public class RangeCalc {
	RangeCalc(double v0, double angle){
		if (v0 > 0 && (angle > 0 && angle <= 45)) {
			double g, angleInRads, range;
			g = 9.81;
			angleInRads = angle * Math.PI / 180;
			range = 2 * v0 * v0 * Math.sin(angleInRads) * Math.cos(angleInRads) / g;
			System.out.println("Range: " + range);
		} else {
			System.out.println("Error");
		}
	}
	
	public static void main(String[] arg) {
		new RangeCalc(20, 45);
	}
}
