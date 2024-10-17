public class Leetcode1672 {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        for (int[] person : accounts) {
            int wealth = 0;
            for (int money : person) {
                wealth += money;
            }
            if (wealth > maxWealth) {
                maxWealth = wealth;
            }
        }
        return maxWealth;
    }
}
