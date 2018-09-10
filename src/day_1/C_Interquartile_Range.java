package day_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class C_Interquartile_Range {
/*
 Sample Input

6
6 12 8 10 20 16
5 4 3 2 1 5

Sample Output

9.0

 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int [] element = new int[size];
        int [] frequency = new int[size];
        for (int i = 0; i < size; i++) {
            element[i] = scan.nextInt();
        }
        for (int i = 0; i < size; i++) {
            frequency[i] = scan.nextInt();
        }
		
		// Create dataset s
        ArrayList<Integer> dataSet = new ArrayList<>();
        for (int i = 0; i < size; i++) {
        	int iElement = element[i];
        	for (int j = 0; j < frequency[i]; j++) {
        		dataSet.add(iElement);
        	}
        }
        
        Collections.sort(dataSet);        
        List<Integer> alQuartile1 = new ArrayList<>();
    	List<Integer> alQuartile3 = new ArrayList<>();
    	
        double quartile1 = 0;
        double quartile2 = getMedian(dataSet); // Median
        double quartile3 = 0;
        
                
        if (dataSet.size() % 2 != 0) { // Odd number elements        	
        	alQuartile1 = dataSet.subList(0, dataSet.size() / 2);
        	alQuartile3 = dataSet.subList((dataSet.size() + 1) / 2, dataSet.size());
        	
        } else {					// Even number elements
        	alQuartile1 = dataSet.subList(0, dataSet.size() / 2);
        	alQuartile3 = dataSet.subList(dataSet.size() / 2, dataSet.size());        	
        }
        
        quartile1 = getMedian(alQuartile1);
        quartile3 = getMedian(alQuartile3);
        
//        System.out.println(dataSet);
//        System.out.println(alQuartile1);
//        System.out.println(alQuartile3);        
        
//        System.out.println(quartile1);
//        System.out.println(quartile2);
//        System.out.println(quartile3);
        
        double interquartileRange = 0;
        interquartileRange = quartile3 - quartile1;
        //System.out.println(interquartileRange);
        System.out.printf ("%.1f", interquartileRange);

	}
	
	public static double getMedian(List<Integer> alElements) {
		double median = 0;		
		if (alElements.size() % 2 != 0) { // Odd number elements
        	median = alElements.get(alElements.size() / 2);
        } else {						// Even number elements
        	double medValue1 = alElements.get((alElements.size() - 1) / 2);
        	double medValue2 = alElements.get(alElements.size() / 2);
        	median = (medValue1 + medValue2) / 2.0;
        }
		
		return median;
	}

}
