import java.util.Scanner;

public class Three {
    public static void reverseArray(int[] arr, int left, int right) {
        if (left >= right) {
            return;
        }
        
        // Swapping the elements using the two pointer approach
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        
        // Recursively calling the reverseArray function
        reverseArray(arr, left + 1, right - 1);
    }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();            
            int[] arr = new int[n]; // Take number of Element

            System.out.println("Enter the elements of the array:");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            
            reverseArray(arr, 0, n - 1);
            
            System.out.println("Reversed Array:");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            
        }       
    }
    
