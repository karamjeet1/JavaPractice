public class isPalindrom {
    public static void main(String[] args) {
        String str = "ABA";
        boolean ans = IsPalindrome(str);
        if (ans) {
            System.out.println(str + " is Palindrome  String");
        } else {
            System.out.println(str + "its NOt  Palindrome String");
        }
    }

    public static boolean IsPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
