//https://practice.geeksforgeeks.org/problems/swap-kth-elements5500/1?page=1&difficulty[]=-2&category[]=Arrays&sortBy=submissions

class Solution {
    void swapKth(int arr[], int n, int k) {
        // code here
        
        if(n > 1)
        {
            int temp = arr[k-1];
            arr[k-1] = arr[n-k];
            arr[n-k] = temp;
        }
        
    }

}
