public class SpiralM {


    public static void printSpiral(int matrix[][]){
        int n = matrix.length-1;
        int m = matrix[0].length -1;
         int startRow = 0, 
             endRow = n-1,
             startCol = 0, 
             endCol = m -1; 


             while (startRow <=  endRow && startCol <= endCol) {
                // i - RoW    j - Column
                //Top
                for (int j = startCol; j <= endCol; j++) {
                    System.out.print(matrix[startRow][j]+" ");
                }
                //  Right 
                for(int i = startRow;i<= endRow;i++){
                    System.out.print(matrix[i][endCol]+ " ");
                }
                //Bottom
                for (int j = endCol - 1; j  >= startCol ; j--) {
                    if (startRow == endRow) {
                        break;
                    }
                    System.out.print(matrix[endRow][j]+" ");
                }
                //left
                for (int i = endRow-1; i >= startRow; i--) {
                    if (startCol == endCol) {
                        break;
                    }
                    System.out.print(matrix[i][startCol]+" ");
                }
                startCol++;
                startRow++;
                endCol--;
                endRow--; 

       }
       System.out.println();
 
    }
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3,4},
                          {5,6,7,8},
                          {9,10,11,12},
                          {13,14,15,16}}; 

        printSpiral(matrix);

    }
}
