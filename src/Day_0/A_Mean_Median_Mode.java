package Day_0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class A_Mean_Median_Mode {
	
	/* INPUT
10
64630 11735 14216 99233 14470 4978 73429 38120 51135 67060

20
6392 51608 71247 14271 48327 50618 67435 47029 61857 22987 64858 99745 75504 85464 60482 30320 11342 48808 66882 40522
	 * */

	public static void main(String[] args) {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner scan = new Scanner(System.in);
		
//		int size = scan.nextInt();
//        int [] array = new int[size];
//        for (int i = 0; i < size; i++) {
//            array[i] = scan.nextInt();
//        }
		
		int n = Integer.parseInt(scan.nextLine());		
		String valuesStr = scan.nextLine();		
		String[] valuesArr = valuesStr.split(" ");
		
		// Values to ArrayList
		ArrayList<Integer> valuesList = new ArrayList<Integer>();		
		for (String valor : valuesArr) {
			valuesList.add(Integer.valueOf(valor));
		}
		Collections.sort(valuesList);
		//System.out.println(valuesList);
		
		// MEAN
		int sum = 0;
		float mean;
		for (Integer valor : valuesList) {
			sum += valor;
		}
		mean = (float) sum / n;
		
		// MEDIAN	
		float median;
		if (n % 2 != 0) {
			median =  valuesList.get(n / 2);// System.out.println(n / 2);
		} else {
			int midValue1 = valuesList.get((n / 2) - 1); //System.out.println((n / 2) - 1);
			int midValue2 = valuesList.get(n / 2); //System.out.println(n / 2);
			median =  (float) (midValue1 + midValue2) / 2;
		}
		
		
		// MODE: Find repeated value
		HashMap<Integer, Integer> repValues = new HashMap<>();
		int mode = 0;
		int reps = 0;
		for (Integer value : valuesList) {
			if (repValues.containsKey(value)) {
				repValues.put(value, repValues.get(value) + 1);
				if (repValues.get(value) > reps) {
					mode = value;
				}
			} else {
				repValues.put(value, 1);
			}			
		}
		
		if (reps == 0) {			
			mode = valuesList.get(0);
		}
		
		// Close the scanner object, because we've finished reading 
        // all of the input from stdin needed for this challenge.
		scan.close(); 
        
		System.out.printf("%,1f", mean);
        System.out.println();
        System.out.println(median);
        System.out.println(mode);

	}
	

}
