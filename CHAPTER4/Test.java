package CHAPTER4;

public class Test {
    public static void num(int i,int n) {
        if (i> n) {
             return;        
        }
        System.out.println(i);
        num(i+1,n);  //Recursive call with incremented value of '
     }
    
}
