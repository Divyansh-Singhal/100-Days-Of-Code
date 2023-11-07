class Solution {
    public int maxUncrossedLines(int[] nums1, int[] nums2) {
        int l1=nums1.length;
        int l2=nums2.length;
        if(l1<l2){
            maxUncrossedLines(nums2,nums1);
        }
        int a[]=new int[l2+1];
        for(int i=1;i<=l1;i++){
            int prev=0;
            for(int j=1;j<=l2;j++){
                int curr=a[j];
                if(nums1[i-1]==nums2[j-1]){
                    a[j]=prev+1;

                }
                else{
                    a[j]=Math.max(a[j-1],curr);
                }
                prev=curr;
            }
        }
        return a[l2];
    }
}