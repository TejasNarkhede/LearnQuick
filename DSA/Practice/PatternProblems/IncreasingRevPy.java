/*

1 2 3 4 5 
1 2 3 4 
1 2 3     // Number Increasing Reverse Pyramid
1 2 
1

 */


 public class IncreasingRevPy {
    static void increasingPyramid(int n) {
        for(int row = n; row >= 1; row--) {
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
