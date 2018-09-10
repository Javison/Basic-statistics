package day_0;

import java.util.Scanner;

/* SAMPLE INPUT
5
10 40 30 50 20
1 2 3 4 5
*/
public class B_Weighted_Mean {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Retrieve values
		int n = Integer.parseInt(scan.nextLine());			// Number elements	
		String[] xValuesStr = scan.nextLine().split(" ");	// Elements array X
		String[] wValuesStr = scan.nextLine().split(" ");	// Elements array W
		// Convert to int Array
		int[] xValues = new int[xValuesStr.length];
		int[] wValues = new int[wValuesStr.length];
		for (int i = 0; i < xValuesStr.length; i++) {
			xValues[i] = Integer.parseInt(xValuesStr[i]);
		}
		for (int i = 0; i < wValuesStr.length; i++) {
			wValues[i] = Integer.parseInt(wValuesStr[i]);
		}
		
		// Denominador
		int denominator = 0;
		for (int i : wValues) {
			denominator += i;
		}
		
		// Nominator
		int nominator = 0;
		for (int i = 0; i < xValues.length; i++) {
			nominator += (xValues[i] * wValues[i]);
		}
		
		// Result
		float result = (float) nominator / denominator;
		
		//System.out.println(result);
		System.out.printf ("%.1f", result);

	}

}

