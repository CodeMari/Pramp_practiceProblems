package FB_practice;
/* Given the root of a binary tree and an integer targetSum, return true if the tree has a root-to-leaf path such that adding up all the values
 along the path equals targetSum.
 recursive solution time: O(N) space O(logN) 
 */
public class pathSum {
    public boolean hasPathSum(TreeNode root, int targetsum){
        if(root ==null) return false;
        targetsum -=root.val; 
        if(root.left ==null) && (root.right ==null)){
            return (targetsum ==0); 

        return hasPathSum(root.left, targetsum)|| hasPathSum(root.right, targetsum); 
        }
    }
    

}
