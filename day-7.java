class Solution {
    public int search(int[] nums, int target) {
       int i=0,n=0,c=0;
       for(i=0;i<nums.length;i++){
           if(nums[i]==target){
               n=i;c++;
           }
       }
       if(c==0){n=-1;} return n;
    }
}