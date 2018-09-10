
import java.util.ArrayList;
import java.util.List;

/**
 * Numero que multiplicado x 4 es igual leyendo al reves.
 * ABCDE * 4 = EDCBA
 *
 */
public class Riddle1 {
	
	public static int[] getArray(int number) {
		
		int[] numArray = new int[5];
		List<Integer> numberList = new ArrayList<>();
		
		while (number > 0) {
			Integer mod = number % 10; 
			number = number / 10;
			numberList.add(mod);
		}
		
		if (numberList.size() < 5) {
			numberList.add(0);
		}
				
		numArray[0] = numberList.get(4);
		numArray[1] = numberList.get(3);
		numArray[2] = numberList.get(2);
		numArray[3] = numberList.get(1);
		numArray[4] = numberList.get(0);	
		
		System.out.println("numberList: " + numberList);
		
		return numArray;
	}

	public static void main(String[] args) {
		// 0 1 2 3 4  - 9 9 9 9 9
		
		for (int i = 1234; i < 99999; i ++) {
		
			int x = i;
			int y = x * 4;
			
			int[] xArray = getArray(x);
			int[] yArray = getArray(y);
			
			System.out.println("x: " + x);
			System.out.println("y: " + y);
			System.out.println("xArray: " + xArray[0] + xArray[1] + xArray[2] + xArray[3] + xArray[4]);
			System.out.println("xArray[3]: " + xArray[3]);
			System.out.println("yArray[3]: " + yArray[3]);
			
			if (xArray[0] == yArray[4]
					&& xArray[1] == yArray[3]
				    && xArray[2] == yArray[2]
				    && xArray[3] == yArray[1]
				    && xArray[4] == yArray[0]) {
				
				System.out.println("FOUND!!!: " + i);
				break;
			}
			
			System.out.println(i);
		}
		

	}

}
