// TO DO - getting array index out of bound using below code
class Solution {
    void zigZag(int arr[], int n) {
        // code here
        
        if(n == 2)
        {
            if(arr[0] > arr[1])
            {
                 int temp = arr[0];
                 arr[0] = arr[1];
                 arr[1] = temp;
            }
        }
        
        if( n > 2)
        {
        
            for(int i = 0; i < n-1; i+=2)
            {
                if(arr[i] > arr[i+1])
                {
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
                
                if(arr[i+1] < arr[i+2])
                {
                    int temp = arr[i+1];
                    arr[i+1] = arr[i+2];
                    arr[i+2] = temp;
                }
            }
        }    
    }
}
