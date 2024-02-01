package CHAPTER4;

public class Recursion {

//base condition in recursion
// the base condition is a condition that is used to stop the
//  recursive function from calling itself again. 
static int count  = 0;
    public static void print(){
        if (count==4) {
            return;
        }
        System.out.println("1");
        print(); //recursive call to the method itself
        count++;
    }
    public static void main(String[] args) {
        print();
    }
}
