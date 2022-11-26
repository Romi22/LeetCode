class Solution{
    
    // Function for finding maximum and value pair
    public static long find_multiplication (int arr[], int brr[], int n, int m) {
        // Complete the Function
        
        Arrays.sort(arr);
        Arrays.sort(brr);
        
        int prod = 0;
        
        if(m >= 0)
        {
            prod = arr[n-1] * brr[0]; 
        }
        
        return Long.valueOf(prod);
    }
    
    
}
