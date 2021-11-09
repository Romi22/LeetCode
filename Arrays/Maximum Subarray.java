// https://leetcode.com/problems/maximum-subarray/

e.g. [-2,1,-3,4,-1,2,1,-5,4]

ALGO:

1. Set first element as currSum and maxSum (given constraint : 1 <= nums.length <= 105) i.e atleast 1 element is there
2. Iterate through all elements starting from second element.
3. For each iteration:
   3.1 Add the currNum to currSum 
   3.2 Compare currNum and currSum
         If currNum is greater than currSum , then assign currNum to currSum
   3.3 Compare currSum and maxSum
         If currSum is greater than maxSum , then assign currSum to maxSum
4. return maxSum as result


//1. Kadane's Algorithm 
class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int currSum = nums[0];
        
        for(int i = 1; i < nums.length; i++)
        {
            currSum += nums[i];
            
            if(nums[i] > currSum)
               currSum = nums[i];
            
            if(currSum > maxSum)
                maxSum = currSum;
         }
        
        return maxSum;
    }
}
