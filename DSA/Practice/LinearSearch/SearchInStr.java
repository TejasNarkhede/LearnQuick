/**
 * LinearSearch
 */
public class SearchInStr {
    public static void main(String[] args) {
        String str = "Tejas";
        char target = 'T';
        System.out.println(search2(str, target));
    }

    
    public static boolean search1(String str, char target) {
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch == target) return true;
        }
        return false;
    }
    
    
    public static boolean search2(String str, char target) {
        for(char ch : str.toCharArray()) {
            if(ch == target) return true;
        }
        return false;
    }
}