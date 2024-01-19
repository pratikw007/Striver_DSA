import java.util.HashSet;

public class Sets {
    public static void main(String[] args) {
        // Hashset?
        HashSet<Integer> set = new HashSet<>();
//  It is unorderd becaused the order of the elements in the queue is Random.
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        System.out.println(set); //1 2 3 4 5
        set.add(1); // Trying to add duplicate element
        set.add(2); // Trying to add duplicate element
        System.out.println(set); //1 2 3 4 5
        set.remove(2);
        System.out.println(set.contains(2)); //false - Bcoz 2 removed from the queue



    }
}
