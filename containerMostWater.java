class Solution {
    public int maxArea(int[] height) {
        int start=0;
        int end=height.length-1;
        int max=0;
        while(start<end)
        {
            int minInd=Math.min(height[start],height[end]);
            int water=minInd*(end-start);
            if(water>max)
            {
                max=water;
            }
            if(height[start]<height[end])
            {
                start++;
            }
            else if(height[start]>height[end])
            {
                end--;
            }
            else if(height[start]==height[end])
            {
                start++;
                end--;
            }
        }
        return max;
    }
}