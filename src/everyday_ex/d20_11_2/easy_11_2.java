package everyday_ex.d20_11_2;

/*
    给定两个数组，编写一个函数来计算它们的交集
 */

import java.util.ArrayList;

public class easy_11_2 {
    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        int[] intersection = intersection(nums1, nums2);
        for (int i = 0; i < intersection.length; i++) {
            System.out.println(intersection[i]);
        }
    }
    public static int[] intersection(int[] nums1 , int[] nums2){
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i : nums1) {
            for (int j : nums2) {
                if (i == j) {
                    arr.add(i);
                }
            }
        }
        quChong(arr);
        int[] result = new int[arr.size()];
        for (int i = 0;i<result.length;i++){
            result[i] = arr.get(i);
        }
        return result;
    }

    private static void quChong(ArrayList<Integer> arr) {
        int size = arr.size();
        for (int i = 0;i<size;i++){
            for (int j = i+1;j<size;j++){
                if (arr.get(i).equals(arr.get(j))){
                    arr.remove(j);
                    size --;
                    j--;
                }
            }
        }
    }
}
