package JavaPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Subarray {
    public static void main(String[] args) {
        // int arr[] = { 1, 2, 3, 7, 5 };
        int arr[] = { 3, 9, 2, 9, 4, 9 };
        int sum = 15;
        majorityElement(arr);
        // sumArray(arr, sum);
        // SubArray(arr, sum);
        // ArrayList<Integer> subarrayIndices = subarraySum(arr, arr.length, sum);

        // if (subarrayIndices.size() > 0) {
        // System.out.println("Subarray found:" + subarrayIndices);
        // } else {
        // System.out.println("No subarray found with the given sum.");
        // }

    }

    public static void sumArray(int[] arr, int sum) {
        for (int i = 0; i < arr.length; i++) {

            int CurrSum = 0;
            for (int j = i + 1; j < arr.length; j++) {
                CurrSum += arr[j];
                if (CurrSum == sum) {
                    System.out.println("Sum is found at: " + i + " " + j);
                    return;
                }
            }

        }

        System.out.println("No subarray found with the given sum.");
    }

    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
        int CurrSum = 0;
        int i = 0;

        for (int j = 0; j < n; j++) {
            CurrSum += arr[j];

            while (CurrSum > s) {
                CurrSum -= arr[i];
                i++;
            }

            if (CurrSum == s) {
                ArrayList<Integer> Newsum = new ArrayList<Integer>();
                for (int k = i; k <= j; k++) {
                    Newsum.add(arr[k]);
                }
                return Newsum;
            }
        }

        return new ArrayList<Integer>();
    }

    public static void SubArray(int arr[], int sum) {
        int currSum = 0;
        int start = 0;
        int end = -1;
        HashMap<Integer, Integer> newsum = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            currSum += arr[i];
            if (currSum - sum == 0) {
                start = 0;
                end = i;
                break;
            }
            if (newsum.containsKey(currSum - sum)) {
                start = newsum.get(currSum - sum) + 1;
                end = i;
                break;
            }
            newsum.put(currSum, i);
        }
        if (end == -1) {
            System.out.println(" Not found");
        } else {
            System.out.println(start + "," + end);
        }

    }

    public static int majorityElement(int arr[]) {
        Arrays.sort(arr);
        int mid = (arr.length - 1) / 2;
        return arr[mid];
    }

}
