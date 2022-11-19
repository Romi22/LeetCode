// https://practice.geeksforgeeks.org/problems/reverse-array-in-groups0255

class Solution {
    //Function to reverse every sub-array group of size k.
    void reverseInGroups(ArrayList<Integer> arr, int n, int k) {
        // code here
        
        int left,right;
        
      // i is increamented in a way that it jumps to the start index where group starts
      //left + k-1 as the next index would be 5 i = 3, k = 3
           for(int i = 0; i < n-1; i+=k)
           {
               left = i;
             //here right decides the group with k no. of elements
               right = Math.min(left+k-1,n-1);
               
               reverseArray(arr,left,right);
             
           }
  
    }
    
    void reverseArray(ArrayList<Integer> arr, int left, int right)
    {
        while(left < right)
        {
            int temp = arr.get(left);
            arr.set(left, arr.get(right));
            arr.set(right, temp);
            
            left ++;
            right --;
        }
    }
}
