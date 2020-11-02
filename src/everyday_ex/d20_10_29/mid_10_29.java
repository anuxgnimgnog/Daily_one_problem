package everyday_ex.d20_10_29;

public class mid_10_29 {
    public static void main(String[] args) {

    }
    public int sumNumbers(TreeNode root){
        return result(root,0);
    }

    private int result(TreeNode t, int n) {
        if (t == null) {
            return 0;
        }
        int temp = n*10 + t.val;
        if (t.left == null && t.right == null){
            return temp;
        }
        return result(t.left,temp) + result(t.right,temp);
    }
}
