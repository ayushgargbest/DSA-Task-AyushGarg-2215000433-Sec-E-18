class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int maxFreq=0;
        int count=0;
        for(int num:nums)
        {
            map.put(num,map.getOrDefault(num,0)+1);
            if(maxFreq<map.get(num))
            {
                maxFreq=map.get(num);
            }
        }
        for(int num:map.values())
        {
            if(num==maxFreq)
            {
                count+=num;
            }
        }
        return count;
    }
}