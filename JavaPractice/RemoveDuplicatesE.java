package JavaPractice;

import java.util.Arrays;

public class RemoveDuplicatesE {
    public static void main(String[] args) {
        int arr[] = { 2, 4, 3, 2, 4, 5, 4, 5, 6, 7 };
        int ans[] = removeDuplicates(arr);
        System.out.println("uniqueArr: ");
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }

    public static int[] removeDuplicates(int[] arr) {
        Arrays.sort(arr);
        int[] temp = new int[arr.length];
        int j = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                temp[j++] = arr[i];
            }
        }

        return temp;
    }

}
