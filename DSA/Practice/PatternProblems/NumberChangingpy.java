/*

1 
2 3 
4 5 6     // Number Changing Pyramid
7 8 9 10

 */

public class NumberChangingpy {
    static void changingPyramid(int n) {
        int count = 0;
        for(int row = 1; row <= n; row++) {
            for(int col = 1; col <= row; col++) {
                System.out.print((++count) + " ");
            }
            System.out.println(); 
        }
    }

    public static void main(String[] args) {
        changingPyramid(5);
    }
}
