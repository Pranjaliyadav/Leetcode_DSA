var isSameTree = function(p, q) {
    if(!p && !q) return true //checking if p and q both are null, return true, can be identical
    if(!p || !q) return  //only one is null, not identical
    return p.val === q.val && isSameTree(p.left, q.left) && isSameTree(p.right, q.right)
};
