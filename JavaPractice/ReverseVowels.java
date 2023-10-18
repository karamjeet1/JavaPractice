package JavaPractice;

public class ReverseVowels {
    public static void main(String[] args) {
        String str = "Hello";
        System.out.println(reverseVovles(str));

    }

    public static String reverseVovles(String str) {
        int n = str.length();
        char[] c = str.toCharArray();
        int start = 0;
        int end = n - 1;
        while (start < end) {
            if (!isVovles(c[start])) {
                start++;
            } else if (!isVovles(c[end])) {
                end--;
            } else {
                char tmp = c[start];
                c[start] = c[end];
                c[end] = tmp;
                start++;
                end--;
            }
        }
        return String.valueOf(c);

    }

    private static boolean isVovles(char c) {
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
                || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
            return true;
        } else {
            return false;
        }
    }
}
