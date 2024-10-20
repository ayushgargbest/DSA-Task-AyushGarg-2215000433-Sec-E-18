class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int maxlen=0;
        int sum=0;
        map.put(0,-1);
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i]==0?-1:1;
            if(map.containsKey(sum-0))
            {
                int length=i-map.get(sum-0);
                if(length>maxlen)
                {
                    maxlen=length;
                }
            }
            else
            {
                map.put(sum,i);
            }
        }
        return maxlen;
    }
}