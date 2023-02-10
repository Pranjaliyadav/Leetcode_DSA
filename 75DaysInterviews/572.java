class Solution {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root == null) return false;
        if(helperSubTree(root, subRoot)) return true;
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    public boolean helperSubTree(TreeNode root, TreeNode subRoot){
        if(root == null && subRoot == null) return true;
        if(root == null || subRoot == null) return false;
        
        if(root.val != subRoot.val) return false;

        return helperSubTree(root.left, subRoot.left) && helperSubTree(root.right, subRoot.right);
    }
}