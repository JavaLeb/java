package thread;

/**
 * Created by leboop on 2018/11/18.
 */
public class Plalindrome {
    public static void main(String[] args) {
        System.out.println(getPlalindrome("aba"));
    }

    public static String getPlalindrome(String str) {
        String plalindrome = "";
        if (str != null && str.length() > 0) {
            int len = str.length();
            for (int i = 0; i < len; i++) {
                int left = i-1;
                int right = i+1;
                while (left >= 0 && right < len) {
                    String leftChar = str.substring(left, left + 1);
                    String rightChar = str.substring(right, right+1);
                    left--;
                    right++;
                    if (!leftChar.equals(rightChar)) {
                        break;
                    }
                }
                String s = str.substring(left + 1, right);
                if (s.length() > plalindrome.length()) {
                    plalindrome = s;
                }
            }
        }
        return plalindrome;
    }
}
