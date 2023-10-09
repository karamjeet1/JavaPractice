package JavaPractice;

import java.util.Arrays;

public class MajorityElement {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 2, 3, 3 };

        // majorityElement(arr);
        System.out.println(elem(arr));
    }

    private static void majorityElement(int arr[]) {

        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j])
                    count++;
            }
            if (count > 1) {
                System.out.println(arr[i]);
            }
        }
    }

    public static int elem(int arr[]) {
        Arrays.sort(arr);
        int mid = (arr.length - 1) / 2;
        return arr[mid];
    }
}
