package CHAPTER4;

import java.util.Scanner;

public class PrintNNumber {

    public static void num(int i,int n) {
       if (i> n) {
            return;        
       }
       System.out.println(i);
       num(i+1,n);  //Recursive call with incremented value of '
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1; // number of rows to print
        num(i, n);
    }
}
