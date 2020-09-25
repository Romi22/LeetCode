//https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/

class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        
//         int l = nums.length;
//         int count = 0;
        
//         int[] res = new int[l];
        
//         for(int i=0;i<l;i++)
//         {
//             count = 0; 
//             for(int j=0;j<l;j++)
//             {
//                 if(nums[i]>nums[j])
//                     count++;
//             }
            
//             res[i]=count;
//         }
//         return res;
        
        int[] hash = new int[101];
        int[] res = new int[nums.length];
        for(int i : nums)
        {
            hash[i]++;
        }
        
        for(int i=1;i<=100;i++)
        {
            hash[i] = hash[i] + hash[i-1];
        }
        
        for(int i=0; i<nums.length; i++)
        {
            if(nums[i] == 0)
                res[i] = 0;
                
            else
                res[i] = hash[nums[i]-1];
        }
        
        return res;
    }
}
