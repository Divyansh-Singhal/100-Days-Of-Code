class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr=new int[2];
        int a,b;
        for(int i=0;i<nums.length;i++){
           if(i+1<nums.length)
            for(int j=i+1;j<nums.length;j++){
                if((nums[i]+nums[j])==target){
                    arr[0]=i;arr[1]=j;
                    break;
                }
            }
        }
        return arr;
    }
}