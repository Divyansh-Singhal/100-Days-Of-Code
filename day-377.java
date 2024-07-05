class Solution {
    public void solve(TreeNode root, Set<Integer> S) {
        if (root != null) {
            S.add(root.val);
            solve(root.left, S);
            solve(root.right, S);
        }
    }

    public int findSecondMinimumValue(TreeNode root) {
        TreeSet<Integer> S = new TreeSet<>();
        solve(root, S);

        S.pollFirst();

        if (!S.isEmpty())
            return S.first();

        return -1;
    }
}