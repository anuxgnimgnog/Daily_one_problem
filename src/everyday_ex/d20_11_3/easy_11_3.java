package everyday_ex.d20_11_3;

/*
给定一个整数数组 A，如果它是有效的山脉数组就返回 true，否则返回 false。
 */
public class easy_11_3 {
    public static void main(String[] args) {
        int[] A = {14,82,89,84,79,70,70,68,67,66,63,60,58,54,44,43,32,28,26,25,22,15,13,12,10,8,7,5,4,3};
        boolean f = validMountainArray(A);
        System.out.println(f);
    }
    public static boolean validMountainArray(int[] A){
        if (A.length < 3){
            return false;
        }
        /*
        思路： 先找到数组中的最大值 按其将数组分为两个
               分别遍历判断是否满足从大到小或从小到大
         */
        int count = 0; //记录最大值位置
        int max = A[0];
        for (int i = 1;i<A.length;i++){
            if (A[i]>=max) {
                max = A[i];
                count = i;
            }
        }
        boolean f1 = false;
        boolean f2 = false;
        for (int i = 0;i < count;i++){
            if (A[i] < A[i+1]){
                f1 = true;
            }else {
                f1 = false;
                break;
            }
        }
        for (int i = count;i<A.length-1;i++){
            if (A[i] > A[i+1]){
                f2 = true;
            }else {
                f2 = false;
                break;
            }
        }
        return f1&&f2;
    }
}
