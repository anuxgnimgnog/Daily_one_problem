package everyday_ex.day2;

import java.util.Arrays;

public class easy_10_26 {
    public static void main(String[] args) {
        int[] nums =new int[] {8,1,2,2,3};
        int[] ints = smallerNumbersThanCurrent(nums);
        System.out.println(Arrays.toString(ints));
    }
    public static int[] smallerNumbersThanCurrent(int[] nums){
        int[] result = new int[nums.length];
        for (int i = 0;i<nums.length;i++){
            int count = 0;
            for (int j = 0;j<nums.length;j++){
                if (i != j){
                    if (nums[i] > nums[j]){
                        count ++;
                    }
                }
            }
            result[i] = count;
        }
        return result;
    }
}
