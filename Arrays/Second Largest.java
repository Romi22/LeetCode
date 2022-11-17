//https://practice.geeksforgeeks.org/problems/second-largest3735/1?page=1&difficulty[]=-2&category[]=Arrays&sortBy=submissions

//If 2nd largest element doesn't exist then return -1.
//


class Solution {
    int print2largest(int arr[], int n) {
        // code here
        
        int first = -1;
        int second = -1;
    
        for(int i = 0; i < n; i++)
        {
            if(arr[i] > first)
            {
                second = first;
                first = arr[i];
            }
            
           if(arr[i] > second && arr[i]!=first )
           {
               second = arr[i];
           }
        }
        
        return second;
      }
}
