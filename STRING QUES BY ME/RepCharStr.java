import java.lang.reflect.Array;
import java.util.Arrays;

public class RepCharStr {
    // To replace Charecter with it's Occurance in String

        public static void main(String[] args) {
              //Method 1

              String input = "opentext";
              char charToReplace = 't';
            //   expected output : open1ex2

    //checking the charecter "t" weather it is available in the string or not

                              //    System.out.println(input.indexOf(charToReplace)); // 4
      
    if(input.indexOf(charToReplace) == -1){
        System.out.println("Charecter is not present");
        System.exit(0);
       } 

       //logic to replace if charecter is occurance in string

       char[] arr = input.toCharArray(); //  o p e n t e x t
       
                                   //    System.out.println(arr);
            int count  = 1;
        
       for(int  i = 0;i<arr.length;i++){
        if (arr[i] == charToReplace) { // o == t p == t e==t n==t  t==t
            // System.out.println(String.valueOf(count).charAt(0));
             arr[i] = String.valueOf(count).charAt(0);
             count++;;
        }
       }

       System.out.println(Arrays.toString(arr));


        }
}
