import java.lang.reflect.Method;

public class Reverses {

    public static void main(String[] args) {
        String str = "hello";
        int  len  = str.length();
        
        // Method 1 using toCharArray 

        char[] chaArr = str.toCharArray();

        System.out.println(chaArr[0]); //convert the string into char array


        for (int i = chaArr.length-1; i >= 0; i--) {
            System.out.print(chaArr[i]);
        }

        // Method 2 using charAt Method
         for (int i = len-1; i >=0 ; i--) {
            System.out.print(str.charAt(i)+" ");
         }
        
        // Method 3 using Stringbuffer Class (.reverse() method)
        StringBuffer sb = new StringBuffer(str);
        System.out.println(sb.reverse());
        
        // Method 3 using StringBuilder Class (.reverse() method)
            StringBuilder sbs  =  new StringBuilder(str);
            System.out.print(sbs.reverse());
    }
}