package JavaPractice;

public class MergeArrays {
    public static void main(String[] args) {
        int arr1[] = { 1, 2, 3, 0, 0, 0 };
        int arr2[] = { 2, 5, 6 };
        // int ans[] = mergeArrays(arr1, arr2);
        System.out.println("mergeArrays: ");

        // for (int i = 0; i < ans.length; i++) {
        // System.out.print(ans[i] + " ");
        // }
        int ans[] = mergeArray(arr1, arr2);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i] + " ");
        }

    }

    public static int[] mergeArrays(int[] arr1, int[] arr2) {
        int[] newArr = new int[arr1.length + arr2.length];

        int i = 0;
        for (int element : arr1) {
            newArr[i++] = element;
        }

        for (int element : arr2) {
            newArr[i++] = element;
        }

        return newArr;
    }

    public static int[] mergeArray(int arr1[], int arr2[]) {
        int m = arr1.length;
        int n = arr2.length;
        int[] mergedArray = new int[m + n]; // Create a new array to hold the merged elements
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (i >= 0 && j >= 0) {
            if (arr1[i] > arr2[j]) {
                mergedArray[k] = arr1[i];
                k--;
                i--;
            } else {
                mergedArray[k] = arr2[j];
                k--;
                j--;
            }
        }

        while (i >= 0) {
            arr1[k--] = arr1[i--];
        }
        while (j >= 0) {
            arr1[k--] = arr2[j--];
        }

        return mergedArray;
    }

}
