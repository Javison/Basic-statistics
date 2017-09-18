package Day_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class B_Quartiles {
/* 
-- SAMPLE INPUT
9
3 7 8 5 12 14 21 13 18
-- SAMPLE OUTPUT
6
12
16
*/
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Retrieve values
		int n = Integer.parseInt(scan.nextLine());			// Number elements	
		String[] xValuesStr = scan.nextLine().split(" ");	// Elements array X
		// Convert to int Array
		Integer[] xValues = new Integer[xValuesStr.length];
		for (int i = 0; i < xValuesStr.length; i++) {
			xValues[i] = Integer.parseInt(xValuesStr[i]);
		}
		
		ArrayList<Integer> xValuesList = new ArrayList<>(Arrays.asList(xValues));
		Collections.sort(xValuesList);
		double median;
		double quartile1;
		double quartile2;
		double quartile3;
		
		
		if (n % 2 != 0) {
			// Odd number of elements
			median = xValuesList.get((n - 1) / 2);
			quartile2 = median;
			List<Integer> groupQuantile1 = xValuesList.subList(0, (n - 1) / 2);
			List<Integer> groupQuantile2 = xValuesList.subList( (n + 1)  / 2, n);
			
			System.out.println(groupQuantile1);
			System.out.println(groupQuantile2);
			
			quartile1 = (groupQuantile1.get((groupQuantile1.size() - 1) / 2)
						+ groupQuantile1.get((groupQuantile1.size() + 1) / 2)) / 2.0;
			
			quartile3 = (groupQuantile2.get((groupQuantile2.size() - 1) / 2)
					+ groupQuantile2.get((groupQuantile2.size() + 1) / 2)) / 2.0;
			
			
		} else {
			// Even pair of elemnts
			median = (xValuesList.get((n / 2) - 1) + xValuesList.get(n / 2)) / 2.0;
			quartile2 = median;
			List<Integer> groupQuantile1 = xValuesList.subList(0, (n  / 2) - 1);
			List<Integer> groupQuantile2 = xValuesList.subList(n / 2, n);
			
			quartile1 = (double) groupQuantile1.get(groupQuantile1.size() / 2);
			quartile3 = (double) groupQuantile2.get(groupQuantile2.size() / 2);
		}
		
		System.out.println((int)quartile1);
		System.out.println((int)quartile2);
		System.out.println((int)quartile3);

	}

}
