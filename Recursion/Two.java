import java.util.Scanner;

public class Two {

    
//Sum of number  series
    // public static int sum(int n){
    //     if (n==0) return 0;
    //     return n + sum(n-1);
    // }

    //Factorial of number
    public static int Fact(int n){
       if (n==0) return 1;    
       return n*Fact(n-1);
       }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // System.out.println(sum(n));
        System.out.println(Fact(n));

    }
}
