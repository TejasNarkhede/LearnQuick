/*

    1
   2 2
  3 3 3   // Number Triangular
 4 4 4 4
5 5 5 5 5

*/

public class NumberTriangular {
    static void numberTriangular(int n) {
        for(int row = 1; row <= n; row++) {
            // spaces
            for(int space = n; space >= row; space--) {
                System.out.print(" ");
            }
            for(int col = 1; col <= row; col++) {
                System.out.print(row + " ");
            }
            System.out.println(); 
        }   
    }
    

    public static void main(String[] args) {
        numberTriangular(5);
    }
}
