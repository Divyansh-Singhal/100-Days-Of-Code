class Solution {
    public long largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        long[] prefix = new long[nums.length + 1];
        int i = 1;
        while(i < prefix.length){
            prefix[i] = prefix[i-1] + nums[i++ - 1];
        }
        i = nums.length - 1;
        while(i > 1){
            if(prefix[i] > nums[i--]){
                return prefix[i + 2];
            }
        }
        return -1;
    }
}