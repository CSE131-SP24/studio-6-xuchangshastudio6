package studio6;

import edu.princeton.cs.introcs.StdDraw;

public class RecursiveMethods {

	/**
	 * Computes the geometric sum for the first n terms in the series
	 * 
	 * @param n the number of terms to include in the sum
	 * @return the sum of the first n terms of the geometric series (1/2 + 1/4 + 1/8
	 *         ...)
	 */
	public static double geometricSum(int n) {
		if(n==0)
		{
			return 0.0;
		}
		else
		{
			return Math.pow(0.5, n) + geometricSum(n-1);
		}
			// FIXME compute the geometric sum for the first n terms recursively		
	}

	/**
	 * This method uses recursion to compute the greatest common divisor
	 * for the two input values
	 * 
	 * @param p first operand
	 * @param q second operand
	 * @return greatest common divisor of p and q
	 */
	public static int gcd(int p, int q) {
		
			// FIXME compute the gcd of p and q using recursion
			return 0;
		
	}

	

	/**
	 * This method uses recursion to create a reverse of the given array
	 * 
	 * @param array the array to create a reverse of, not to be mutated
	 * @return an array with the same data as the input but it reverse order
	 */
	public static int[] toReversed(int[] array) {
		
			// FIXME create a helper method that can recursively reverse the given array
			return new int[0];
		
	}

	/**
	 * @param xCenter                       x-coordinate of the center of the circle
	 *                                      at the current depth
	 * @param yCenter                       y-coordinate of the center of the circle
	 *                                      at the current depth
	 * @param radius                        radius of the circle at the current
	 *                                      depth
	 * @param radiusMinimumDrawingThreshold radius above which drawing should occur
	 */
	public static void circlesUponCircles(double xCenter, double yCenter, double radius,
			double radiusMinimumDrawingThreshold) {
		// FIXME
		double bound = 5.0;
		StdDraw.setXscale(-bound, bound);
		StdDraw.setYscale(-bound, bound);
		
		StdDraw.circle(xCenter, yCenter, radius);
		
		if(radius/3.0 > radiusMinimumDrawingThreshold)
		{
			double newRadius = radius/3.0;
			double newXCenter = xCenter + radius;
			double newYCenter = yCenter + radius;
			StdDraw.circle(-newXCenter, 0, newRadius);
			StdDraw.circle(newXCenter, 0, newRadius);
			StdDraw.circle(0, -newYCenter, newRadius);
			StdDraw.circle(0, newYCenter, newRadius);

			circlesUponCircles(newXCenter, newYCenter, newRadius, radiusMinimumDrawingThreshold);
		}
		
	}

}
