package JavaPractice;

import java.util.HashSet;
import java.util.Set;

public class FindMisingno {
    public static void main(String[] args) {

    }

    public static int findMisingNo(int arr[]) {
        int currSum = 0;
        for (int i = 0; i < arr.length; i++) {
            currSum += arr[i];
        }
        return 0;

    }

    public int missingNumber(int[] nums) {
       
        Set<Integer> hash = new HashSet<>();
        
        for (int i = 0; i < nums.length; i++) {
           
            hash.add(nums[i]);
        }
      
        for (int i = 0; i <= hash.size(); i++) {
           
            if (!hash.contains(i))
                return i;
        }
    
        return -1;
    }

}
