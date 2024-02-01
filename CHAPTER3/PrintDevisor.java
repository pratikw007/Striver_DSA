package CHAPTER3;

public class PrintDevisor {
    public static void main(String[] args) {
        Print(3);
        
    }

    public static void Print(int N){
        int sum = 0;
        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                sum = sum + i;
                System.out.print(sum);
            }
        }
        // System.out.println(sum);
    }
}
