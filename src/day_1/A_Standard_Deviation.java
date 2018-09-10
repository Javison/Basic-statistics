package day_1;

import java.util.Scanner;

/* SAMPLE INPUT
5
10 40 30 50 20
*/

public class A_Standard_Deviation {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Retrieve values
		int n = Integer.parseInt(scan.nextLine());			// Number elements	
		String[] xValuesStr = scan.nextLine().split(" ");	// Elements array X
		// Convert to int Array
		int[] xValues = new int[xValuesStr.length];
		for (int i = 0; i < xValuesStr.length; i++) {
			xValues[i] = Integer.parseInt(xValuesStr[i]);
		}
		
		// Mean
		float mean = 0;
		int sumValues = 0;
		for (int iVal : xValues) {
			sumValues += iVal;
		}
		
		mean = (float) sumValues / n;
//		System.out.println(mean);
		
		// Variance: Square 
		double variance = 0;
		double varianceNumerator = 0;
		double varianceDenominator = n;
		for (int i = 0; i < xValues.length; i++) {
			// Math.pow(xValues[i] - mean, 2)
			varianceNumerator += (xValues[i] - mean) * (xValues[i] - mean);
		}
		variance = (double) varianceNumerator / varianceDenominator;
		
//		System.out.println (variance);
//		System.out.println (varianceNumerator);
//		System.out.println (varianceDenominator);
		
		// Standard Deviation
		double standard = Math.sqrt(variance);
		
		
		//System.out.println(xValues[2]);
		System.out.printf ("%.1f", standard);

	}

}
