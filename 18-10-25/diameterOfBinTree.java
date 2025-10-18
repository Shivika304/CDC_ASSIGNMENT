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
class diameterOfBinTree {
    int longest;
    public int diameterOfBinaryTree(TreeNode root) {
       longest=0;
       helper(root);
       return longest;
    }
    public int helper(TreeNode r){
        if(r==null){
            return 0;
        }
        int left=helper(r.left);
        int right=helper(r.right);
        longest=Math.max(longest,left+right);
        return Math.max(left,right)+1;
    }

}

