//https://practice.geeksforgeeks.org/problems/cyclically-rotate-an-array-by-one2614

class Compute {
    
    public void rotate(int arr[], int n)
    {
        int tempA = arr[0];
        
        arr[0] = arr[n-1];
        
        if(n > 1)
        {
        
            for(int i = n-1; i >= 1; i--)
            {
                int temp = arr[i];
                arr[i] = arr[i-1];
                arr[i-1] = temp;
            }
            
            arr[1] = tempA;
        }    
    }
}
