class Solution {
    public int[] runningSum(int[] nums) {
        
        int sum = 0;
        
        int length = nums.length;
        
        int[] result = new int[length];
        
        int k = 0;
        
        for(int i = 0; i < length; i++)
        {
             sum = sum + nums[i];
             result[k++] = sum;
        }
        
        
        return result;
        
    }
}
