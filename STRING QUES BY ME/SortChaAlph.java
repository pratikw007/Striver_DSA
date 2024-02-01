import java.util.Arrays;

public class SortChaAlph {
    // challenge 5 : To sort String Charecter In Alphabetical Order
    public static void main(String[] args) {
          String str = "rock";


        //   Method 1
          char arr[] = str.toCharArray();

        //   char temp ;
        //   for (int i = 0; i < arr.length; i++) {
        //     for (int j = i+1 ; j < arr.length; j++) {
        //         if (arr[i]>arr[j]) {
        //             temp =  arr[i];
        //             arr[i] = arr[j];
        //             arr[j] = temp;
        //         }
        //     }
        //   }
        //   System.out.println(new String(arr));

        //   Method 2

        Arrays.sort(arr);
        System.out.println(arr);
      

    }
}
