//Gives TLE

class Solution {
    void leftRotate(int[] arr, int n, int d) {
        // code here
        while(d-- > 0)
        {
            int tempA = arr[0];
            
           for(int i = 0; i < n-1; i++)
           {
               int temp = arr[i];
               arr[i] = arr[i+1];
               arr[i+1] = temp;
           }
           
           arr[n-1] = tempA;
           
        }  
    }
}
