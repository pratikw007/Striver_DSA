import java.util.HashMap;
import java.util.Map;
import java.util.*;

import javax.swing.RowFilter.Entry;

public class FirNonRep {
    // To find first Non Repeates Charecter in String

    public static void main(String[] args) {
        String str = "AABCDBE";

        //Method 1 
        // for (int i = 0; i < str.length(); i++) {
        //     boolean unique = true;

        //     for (int j = 0; j < str.length(); j++) {
        //         if (i != j && str.charAt(i) == str.charAt(j)) {
        //             unique = false;
        //             break;
        //         }
        //     }
        //     if (unique) {
        //         System.out.println(str.charAt(i)); // C
        //         break;
        //     }
        //   }

        //Method 2
        Map<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            //if key Exist ,Put in map by incrementing value by 1
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch)+1);
            }else{
                map.put(ch, 1);
            }
        }
        System.out.println(map);  //{A=2, B=2, C=1, D=1, E=1}
        for(Entry<Charecter,Integer> entrySet : map.entrySet()){
            if(entrySet.getValue()==1){

            }
        }
    }
}
  