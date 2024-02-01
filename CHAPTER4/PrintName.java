package CHAPTER4;

// import java.util.Scanner;
// import java.util.jar.Attributes.Name;

// public class PrintName {


//     public static int Names(i,n){
//        if (i > n) {
//          return;
//        }
//        System.out.println("Ram");
//        Names(i+1,n);
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int  n = sc.nextInt();
//         Names(i,n);
//     }
// }



import java.util.Scanner;

public class PrintName {

    public static void Names(int i, int n) {
        if (i > n) {
            return;
        }
        System.out.println("Ram");
        Names(i + 1, n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;  // Initialize variable i
        Names(i, n);
    }
}

