/*

1 
1 2 
1 2 3     // Number Increasing Pyramid
1 2 3 4 
1 2 3 4 5

 */


public class IncreasingPy {
    static void increasingPyramid(int n) {
        for(int row = 1; row <= n; row++) {
            for(int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println(); 
        }
    }
    public static void main(String[] args) {
        increasingPyramid(5);
    }
}
