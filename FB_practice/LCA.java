/*Given two nodes of a binary tree p & q, return their lowest common ancestor
each node will have a reference to its parent node the def of a Node is: 
class Node{
    public int val; 
    public Node left; 
    public Node right; 
    public Node parent; 
}

According to the definition of LCA on Wikipedia: "The lowest common ancestor of two nodes p and q in a tree T is the lowest node that has both p and q as descendants (where we allow a 
node to be a descendant of itself
Input: root = [3,5,1,6,2,0,8,null,null,7,4], p = 5, q = 1
Output: 3
*/

class Solution{
    public Node lowestCommonAncestor(Node p, Node q){
        Set<Node> visited = new HashSet<>(); 
        while(p!=null){
            visited.add(p); 
            p= p.parent; 
        }
        while(q!=null){
            if(visited.contains(q)){
                return q;
            }
            q=q.parent; 
        }
        return null;
    }
}
