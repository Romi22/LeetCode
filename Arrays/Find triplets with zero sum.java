// https://practice.geeksforgeeks.org/problems/find-triplets-with-zero-sum

class Solution
{
    // arr[]: input array
    // n: size of the array
    //Function to find triplets with zero sum.
	public boolean findTriplets(int arr[] , int n)
    {
        //add code here.
        Arrays.sort(arr);
        
        if(n > 0)
        {
          
           for(int i = 0; i < (n-2) ; i++)
           {
               
               int left = i+1;
               int right = n-1;
               
               while(left < right)
               {
                   
                       
                       int sum = arr[i]+arr[left]+arr[right];
                       
                       if(sum < 0)
                            left++;
                       else if(sum == 0)
                            return true;
                       else
                            right --;
                       
               }
           }
            
        }
        
        return false;
    }
}
