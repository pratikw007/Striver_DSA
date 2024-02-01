package CHAPTER3;

public class Mathss {

    public static void MathsOperation(int n){
        int count = 0;
            while (n>0) {
                int lastNumber = n % 10;
                System.out.print(lastNumber+" ");
                count++;
                n = n / 10;
            }
                // System.out.println(count);
        }
      public static void main(String[] args) {
        MathsOperation(7789);
      }
}
