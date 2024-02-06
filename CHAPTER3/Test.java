package CHAPTER3;

import java.util.*;
public class Test {
	
	public static void main(String[] args) {
		// Write your code here
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		while(N>0){
			int lastDigit = N % 10;
            System.out.println(lastDigit);
			// N = N / 10;
			// System.out.print(N);
		}

	}
}
