// https://leetcode.com/problems/search-insert-position/

class Solution {
    public int searchInsert(int[] nums, int target) {
        
        Map<Integer, Integer> hashMap = new LinkedHashMap<>();
        
        if(nums.length == 1 && target == nums[0])
            return 0;
        
        for(int i = 0; i< nums.length; i++){
            hashMap.put(nums[i], i);
        }
        
        if(hashMap.containsKey(target))
            return hashMap.get(target);
        
        else
        {
            for(int i =0 ; i< nums.length; i++)
            { 
              if( target < nums[i])
                  return i;
             else if(target > nums[i])
             {
                 if (i == nums.length-1)
                  return i+1;
                
                  else
                  {
                      continue;
                  }
             }
                
            }
        }
        
        return Integer.MIN_VALUE;
    }
}
