public class SearchInRange {
    public static void main(String[] args) {
        String name = "Tejas Narkhede";
        int start = 0;
        int end = 5;
        char target = 'T';
        System.out.println(search(name, start, end, target));
    }

    public static boolean search(String str, int start, int end, char target) {
        for(int i = start; i <= end; i++) {
            if(str.charAt(i) == target) return true;
        }
        return false;
    }
}
