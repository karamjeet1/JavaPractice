public class ReverseString {
    public static void main(String[] args) {
        
    }

    public static void reverse(String str) {
        String s = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            char c = str.charAt(i);
            s += c;
        }
        System.out.println(s);
    }

    public static String reverse1(String st) {
        String s = st;
        if (st.length() == 0) {
            return st;
        } else {
            return reverse1(st.substring(1)) + st.charAt(0);
        }

    }
}
