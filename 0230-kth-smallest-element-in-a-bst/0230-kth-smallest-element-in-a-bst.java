class Solution {
        int count = 0;
        int ans = 0;

        public void inOrderTraversal(TreeNode root, int k){
            if (root==null) return;
            inOrderTraversal(root.left, k);
            count+=1;

            if (count == k){
                ans = root.val;
            }
            inOrderTraversal(root.right, k);
        }

    public int kthSmallest(TreeNode root, int k) {
        inOrderTraversal(root, k);
        return ans;
    }
}