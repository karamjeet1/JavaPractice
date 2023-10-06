package JavaPractice;

public class Subarray {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 7, 5 };
        int sum = 15;
        sumArray(arr, sum);
    }

    public static void sumArray(int[] arr, int sum) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("i: " + i);
            int CurrSum = 0;
            for (int j = i + 1; j < arr.length; j++) {
                System.out.println("j:" + j);
                CurrSum += arr[j];
                if (CurrSum == sum) {
                    System.out.println("Sum is found at: " + i + " " + j);
                    return;
                }
            }

        }

        System.out.println("No subarray found with the given sum.");
    }
}
