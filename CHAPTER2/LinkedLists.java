package CHAPTER2;

import java.util.LinkedList;
import java.util.Stack;

public class LinkedLists {
    public static void main(String[] args) {
    LinkedList<Integer> Li = new LinkedList<>();

    Li.add(3);
    Li.add(5);
    Li.add(7);
    Li.add(8);
    Li.add(9);
        // System.out.println(Li); //[3,5,7,8,9]
        StackExamples();    
    }

    public static void StackExamples(){
        Stack<String> st = new Stack<>();
        st.push("John");
        st.push("Doe");
        st.push("Ram");
        st.push("Waghmare");

        System.out.println(st.peek()); //Waghmare
        System.out.println(st.pop());  //Waghmare (will also remove it.)
        System.out.println(st); //[John, Doe, Ram, Waghmare]

        System.out.println(st.size()); //3
        System.out.println(st.empty()); //false
    }
}
