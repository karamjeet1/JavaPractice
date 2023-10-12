package JavaPractice;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int arr[] = { 3, 5, 8, 4, 1, 2, 6, 7 };
        int[] ans = getSorted(arr);
        // System.out.println("Sorted array:");
        // for (int i = 0; i < ans.length; i++) {
        // System.out.print(ans[i] + " ");
        // }
        // ascendingOrdescending(arr);

    }

    public static int[] getSorted(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    public static void ascendingOrdescending(int arr[]) {
        int ans[] = getSorted(arr);
        System.err.println("Ascending Arrays   : ");
        for (int i = 0; i < ans.length; i++) {
            System.err.print(ans[i] + " ");
        }
        System.out.println(" ");
        System.err.println("Descending Arrays   : ");
        for (int i = ans.length - 1; i >= 0; i--) {
            System.err.print(ans[i] + " ");
        }
    }

}
