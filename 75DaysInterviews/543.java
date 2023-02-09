class Solution {
    private int maxNodes = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        getMaxNodes(root);

        return maxNodes == 0 ? 0 : maxNodes - 1;

    }

    public int getMaxNodes(TreeNode node){
        if(node == null) return 0;

        int Left = getMaxNodes(node.left);
        int Right = getMaxNodes(node.right);

        maxNodes = Math.max(maxNodes, (Left + Right + 1));
        return Math.max(Left, Right) + 1;
    }
}