class Solution {
    public int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);
        int r=nums.length/3;
        int [][] ans=new int[r][3];
        int index = 0;
        for (int i = 0; i < nums.length - 2; i += 3) {
            if (nums[i + 2] - nums[i] <= k) {
                ans[index][0] = nums[i];
                ans[index][1] = nums[i + 1];
                ans[index][2] = nums[i + 2];
                index++;
            }
            else {
                return new int[0][];
            }
        }
        return ans;
    }
}