//1. consider the elements to be removed as non-existent and keep copying the visible elements in-place
  class Solution {
    public int removeElement(int[] nums, int val) 
    {
        int j=0;
        
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=val)
            {
                nums[j]=nums[i];
                j++;
            }
        }
        
        return j;
    }
}
