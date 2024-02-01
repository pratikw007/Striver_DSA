public class RemDupCha {
    // Challenege 4 : Remove Duplicate Charecter in the String
    public static void main(String[] args) {
        
        String str = "programming";


        //Approch 1 :using Java 8
        // StringBuilder sb1 = new StringBuilder();
        
        // str.chars().distinct().forEach(c -> sb1.append((char)c));
        // System.out.println(sb1); //progamin
    
        //Approch 2 : 
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i <str.length(); i++) {
            char ch  = str.charAt(i);
            // System.out.println(ch); // programming
            int idx = str.indexOf(ch,i+1);  //Returns the index within this string of the first occurrence of the specified character
            if (idx == -1 ){
                sb2.append(ch);
            }

        }
        System.out.println(sb2);
         
    }
}
