
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}
public class pathSum {

    /*you are required to complete this function */
    boolean hasPathSum(Node root, int target) {
        // Your code here
        return helper(root,0,target);
    }
    boolean helper(Node r,int sum,int target){
        if(r==null){
            return false;
        }
        if(r.left==null && r.right==null){
            return (r.data+sum)==target;
        }
        return helper(r.left,sum+r.data,target)||helper(r.right,sum+r.data,target);
    }
    public static void main(String args[]){
        pathSum obj=new pathSum();
        //node will be created and shared as input
        obj.hasPathSum(null,22);
    }
}
