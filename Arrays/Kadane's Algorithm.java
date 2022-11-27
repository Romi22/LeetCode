//INCORRECT
class Solution{

    // arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
    long maxSubarraySum(int arr[], int n){
        
        // Your code here
        
        int currSum = arr[0];
        int maxSum = Integer.MIN_VALUE;
        
        for(int i = 1; i < n; i++)
        {
            currSum+= arr[i];
            
            if(arr[i] > currSum)
            {
                currSum = arr[i];
            }
            
            if(currSum > maxSum)
            {
                maxSum = currSum;
            }
        }
        
        return maxSum;
        
    }
    
}
