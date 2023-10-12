package JavaPractice;

import java.util.*;

public class Intersection {
    public static void main(String[] args) {
        int a[] = { 1, 2, 2, 1 };
        int b[] = { 2, 2 };
        int[] anc = getElement(a, b);
        for (int n : anc) {
            System.out.println(n);
        }

    }

    public static int[] commonElements(int[] ar, int[] br) {
        List<Integer> common = new ArrayList<>();

        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < br.length; j++) {
                if (ar[i] == br[j]) {
                    common.add(ar[i]);
                    break; // Break the inner loop once a common element is found.
                }
            }
        }

        int[] result = new int[common.size()];
        for (int i = 0; i < common.size(); i++) {
            result[i] = common.get(i);
        }

        return result;
    }

    public static int[] getElement(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            set.add(nums1[i]);
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums2.length; i++) {
            if (set.contains(nums2[i])) {
                list.add(nums2[i]);
                set.remove(nums2[i]);
            }
        }
        int arr[] = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        return arr;

    }

}
