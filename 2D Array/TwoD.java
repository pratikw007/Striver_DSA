import java.util.*;
public class TwoD{

    public static boolean search(int arr[][],int key){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == key) {
                    System.out.println("Found at cell (" + i+","+j +")");
                    return true;
                }
            }
        }
        System.out.println("Element not found in the array.");
        return false;
    }

    public static void main(String[] args) {
        int arr[][] = new int[3][3];
        Scanner sc  = new Scanner(System.in);
        int n = 3, m = 3;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // Print arr
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j]+" ");                
            }
            System.out.println();
            
        }

        search(arr, 6); 

    }

}