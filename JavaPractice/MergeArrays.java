package JavaPractice;

public class MergeArrays {
    public static void main(String[] args) {
        int arr1[] = { 1, 2, 3, 4, 5 };
        int arr2[] = { 6, 7, 8, 9 };
        int ans[] = mergeArrays(arr1, arr2);
        System.out.println("mergeArrays: ");

        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
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
}
