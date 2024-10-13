import java.util.Arrays;

public class SearchIn2d {
    public static void main(String[] args) {
        int[][] twoDArray = {
            {1,2,3,4,5},
            {6,7,8,9,10},
            {11,22,33,44,55},
            {66,77,88,99,100}
        };
        int target = 0;
        System.out.println(Arrays.toString(findTarget(twoDArray, target)));
    }

    public static int[] findTarget(int[][] twoDArr, int target) {
        for(int i = 0; i < twoDArr.length; i++) {
            for(int j = 0; j < twoDArr[i].length; j++) {
                if(twoDArr[i][j] == target) {
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
