import java.util.Arrays;
import java.util.Scanner;

public class isAnagram {
    public static void main(String[] args) {
        String str1 = "dabc";
        String str2 = "abcd";
        String ans = IsAnagram(str1, str2);
        System.out.println(ans);

    }

    public static String IsAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return "Not anagram";
        }
        char temp1[] = str1.toLowerCase().toCharArray();
        char temp2[] = str2.toLowerCase().toCharArray();
        Arrays.sort(temp1);
        Arrays.sort(temp2);
        if (!Arrays.equals(temp1, temp2)) {
            return "Not isAnagram";
        }
        return "isAnagram";
    }
}
