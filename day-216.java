class Solution {
    public int countLargestGroup(int n) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int maxi = 0;
        for(int i= 1;i<=n;i++){
            int x = i,sum = 0;
            while(x>0)
            {
                sum += x%10; 
                x = x/10;
            }
            hm.put(sum, hm.getOrDefault(sum,0)+1);
            maxi = hm.get(sum)>maxi?hm.get(sum):maxi;
        }
        int res = 0;
        for(int i:hm.keySet())
        {
            if(hm.get(i)==maxi)
            res++;
        }
        return res;
    }
}