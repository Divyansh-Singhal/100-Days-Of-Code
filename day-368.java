class Solution 
{
    public int[] findMode(TreeNode root) 
    {
        HashMap<Integer, Integer> map = new HashMap<>();
        inOrder(root, map);

        // find maximum value of HashMap 
        int max = 0;
        for(int val : map.values())
        {
            if(val > max)
                max = val;
        }

        // counting how many times that maximum value is occuring 
        int n = 0;
        for(int val : map.values())
        {
            if(val == max)
                n++;
        }

        // finding those keys whose value is same as that maximum value
        int [] ans = new int[n];
        int i = 0;
        for(int key : map.keySet())
        {
            if(map.get(key) == max)
            {
                ans[i] = key;
                i++;
            }
        }
        return ans;
    }

    // finding frequency of every element
    public void inOrder(TreeNode root, HashMap<Integer, Integer> map)
    {
        if(root == null) return;

        inOrder(root.left, map);

        if(map.containsKey(root.val))
        {
            map.put(root.val, map.get(root.val) + 1);
        }
        else
        {
            map.put(root.val, 1);
        }

        inOrder(root.right, map);
    }
}