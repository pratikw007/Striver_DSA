package CHAPTER2;

import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayListExamples();
    }

    static void ArrayListExamples(){
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);

        System.out.println(arr); // 1 ,2,3,4
        System.out.println(arr.get(1));//get first index  i.e 2



        //modify at index 1
        arr.set(1,10); // set 10 in case on indexing 1
        System.out.println(arr); //1,10,3,4
        System.out.println(arr.contains(10)); // true
    }
    
}
