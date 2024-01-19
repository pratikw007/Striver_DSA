import java.util.HashMap;
import java.util.Map;

public class MapExamples {
    public static void main(String[] args) {
        Map<Integer,String> mp = new HashMap<>();
        //Adding elements to the map
        mp.put(3, "Ram");
        mp.put(1, "Virat");
        mp.put(2, "Binod");

//  Iterating Over keys in a map
//  for (Integer i : mp.keySet()) {
//      System.out.println(i); // 1 2 3 

//  }

//  for (String i : mp.values()) {
//      System.out.println(i);
// // Virat
// // Binod
// // Ram
//  }



//Iterate over Key value mapping
 for(var e : mp.entrySet()){
    System.out.println(e.getValue()); //get the values
    // System.out.println(e.getKey());  // get the keys
 }



        //Part 1
         
        // mp.put(1, "pratik");  //if we add duplicate value then Overridden is occured
        // mp.putIfAbsent(1, "Nityam");
        // System.out.println(mp);// {1=Virat, 2=Binod, 3=Ram}
        // System.out.println(mp.get(2)); // Binod
        // System.out.println(mp.containsKey(4)); // false - Bcoz 4 key in not available in the code.
        // System.out.println(mp.containsValue("Virat"));// true - Available


        // System.out.println(mp.keySet()); // [1,2,3]
        // System.out.println(mp.values());// [Virat, Binod, Ram]
    }
    
}
