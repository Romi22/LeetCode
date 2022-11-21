//

class Solution{
    
  
    int maxTripletSum(int a[], int n)
    {
        // Complete the function
        int maxSum = Integer.MIN_VALUE;
        
        Arrays.sort(a);
        
        int j = n-1;
        maxSum = a[j] + a[j-1] + a[j-2];
             
        
        return maxSum;
    }
  
    
}
