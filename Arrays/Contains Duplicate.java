//https://leetcode.com/problems/contains-duplicate/
/** Gives TLE **/
class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        for(int i = 0; i < nums.length-1; i++)
        {
            for(int j = i+1; j < nums.length; j++)
            {
                if(nums[i] == nums[j])
                    return true;
            }
        }
        
        return false;
    }
}


//2. Using set (we can use hashset as well)

class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        int length = nums.length;
        
        Set<Integer> set = new TreeSet<>();
        
        for(int i: nums)
        {
            set.add(i);
        }
        
        if(set.size() == nums.length)
            return false;
        else
            return true;
    }
}

//3. Using Map


