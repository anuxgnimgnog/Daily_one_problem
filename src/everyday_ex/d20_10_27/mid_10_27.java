package everyday_ex.d20_10_27;

import java.util.ArrayList;
import java.util.List;

/*
    给定一个二叉树，返回它的 前序 遍历
 */
public class mid_10_27 {
    public static void main(String[] args) {
        TreeNode tn1= new TreeNode(1);
        TreeNode tn2= new TreeNode(2);
        TreeNode tn3= new TreeNode(3);
        TreeNode tn4= new TreeNode(4);
        TreeNode tn5= new TreeNode(5);
        TreeNode tn6= new TreeNode(6);
        TreeNode tn7= new TreeNode(7);
        tn1.left=tn2;
        tn1.right=tn3;
        tn2.left=tn4;
        tn2.right=tn5;
        tn3.left=tn6;
        tn3.right=tn7;

        List<Integer> list = preorderTraversal(tn1);
        System.out.println(list);
    }
    public static List<Integer> preorderTraversal(TreeNode root){
        List<Integer> list = new ArrayList<>();
        if (root != null) {
            add(list, root);
        }
        return list;
    }

    private static List<Integer> add(List<Integer> list,TreeNode t) {
        list.add(t.val);
        if (t.left != null){
            add(list,t.left);
        }
        if (t.right != null){
            add(list,t.right);
        }
        return list;
    }
}
