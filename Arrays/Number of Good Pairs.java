//https://leetcode.com/problems/number-of-good-pairs/

class Solution {
    public int numIdenticalPairs(int[] nums) {
//         int l = nums.length;
//         int count = 0;
        
//         for(int i=0;i<l-1;i++)
//         {
//             for(int j=i+1;j<l;j++)
//             {
//                 if(nums[i]==nums[j])
//                  count ++;
//             }
//         }
//         return count;
        return hashMapImp(nums);
    }
    
    public int hashMapImp(int[] nums)
    {
        int[] count = new int[101];
        int pairs = 0;
        
        for(int i : nums) 
        {
            pairs += count[i];
            count[i]++;
        }
        
        return pairs;
    }
}
