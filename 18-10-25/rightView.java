import java.util.*;
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
     }
 }
class rightView{
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        helper(root,list,0);
        return list;
    }
    public void helper(TreeNode r, List<Integer> list,int crdept){
        if(r==null){
            return;
        }
        if(crdept==list.size()){
            list.add(r.val);
        }
        helper(r.right,list,crdept+1);
        helper(r.left,list,crdept+1);
    }
} 