package JavaPractice;

public class FirstAndLastOccarence {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 8, 8, 8, 8 };
        int ans[] = getOccurences(arr, 8);
        System.out.println("FirstOccurence:" + ans[0]);
        System.out.println("LastOccurence:" + ans[1]);
    }

    public static int[] getOccurences(int[] array, int target) {
        int[] result = new int[2];
        result[0] = -1;
        result[1] = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                if (result[0] == -1) {
                    result[0] = i;
                }
                result[1] = i;
            }
        }

        return result;

    }

}
