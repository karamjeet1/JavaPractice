public class DuplicateChar {
    public static void main(String[] args) {
        String str = "buzzzee";
        printDuplicate(str);
    }

    public static void printDuplicate(String str) {
        StringBuilder dupliChar = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (str.indexOf(c, i + 1) != -1) {
                dupliChar.append(c);
            }
        }
        System.out.println(dupliChar.toString());
    }

}
