public class RemSpeCha {
    public static void main(String[] args) {
        String str = "$ja!va$&st%ar";
        // Approch 1  [replaceAll() Method]
        String PlaneStr = str.replaceAll("[^a-zA-Z0-9]", ""); // ^-> anything other than this 
        System.out.println(PlaneStr); //javastar
    }
}
