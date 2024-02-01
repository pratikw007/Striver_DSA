package CHAPTER3;

public class ArmstrongNum {
    public static void main(String[] args) {
        int N = 103;
        int sum = 0;
        int dup = N;
        while (N > 0) {
            int lastDigit  = N % 10;
            sum = sum + (lastDigit*lastDigit*lastDigit);
             N =  N / 10;
            System.out.println(sum);
            //  System.out.print(lastDigit);
        }
        if (sum  ==  dup ) {
            System.out.println("TRUE");
    }else{
        System.out.println(false);
    }
}
}
