public class RemWhiSpa {

    //Chalenge 3
    public static void main(String[] args) {
        String str = "ja   va st   a  rs  ";
        // String trimStr = str.trim(); //it will remove first and last space

        String str1 = str.replaceAll("\\s","");  //  "\\s" -->unicoode valuerepresented Single space
        System.out.println(str1); //javastars

        
    }

}
