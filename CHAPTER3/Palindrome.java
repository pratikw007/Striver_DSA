package CHAPTER3;
import java.util.*;
public class Palindrome {
	
	public static void main(String[] args) {
		   java.util.Scanner sc = new Scanner(System.in);
		   int n = sc.nextInt();

		   int revNum  = 0;
		   int dup = n;
		   while (n>0) {
			   int lastdigit = n % 10;
			   revNum = (revNum * 10)+lastdigit;
			   n =  n / 10;
		   }
		   if (dup == revNum) {
			   System.out.println("true");
		   }else{
			   System.out.println("false");
		   }
	}
}