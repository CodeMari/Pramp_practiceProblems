/**
 * In a Binary Search Tree (BST), an Inorder Successor of a node is defined as the 
 * node with the smallest key greater than the key of the input node
 *  (see examples below). Given a node inputNode in a BST, you’re asked to
 *  write a function findInOrderSuccessor that returns the Inorder Successor of inputNode. 
 * If inputNode has no Inorder Successor, return null.
 * 
 * 
 * 
 * 
 * 
 */

 static class BinarySearchTree{
     Node root; 
     Node findLeftMostNodeInRight(Node n){
         while(n.left!= null){
             n = n.left; 
         }
         return n; 
     }
     Node findInOrderSuccessor(Node inputNode){
         if(inputNode == null){
             return null; 
         }
         Node result; 
         if(inputNode.right !=null){
             result = inputNode.right; 
             inputNode = inputNode.right; 
             return findLeftMostNodeInRight(inputNode);
         }else{
             while(inputNode.parent !=null){
                 if(inputNode.parent.left == inputNode){
                     return inputNode.parent; 
                 }else{
                     inputNode = inputNode.parent; 
                 }
                 }
             }
             return null; 
            }
        }
    }
}
