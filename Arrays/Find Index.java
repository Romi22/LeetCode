// https://practice.geeksforgeeks.org/problems/find-index4752

class Solution
{ 
    // Function to find starting and end index 
    static int[] findIndex(int a[], int N, int key) 
    { 
        //code here.
        
        int[] result = {-1,-1};
        
        int k = 0;
        
        for(int i = 0; i < N; i++)
        {
            
            if(a[i] == key)
            {
                result[k++] = i;
                break;
            }
            
        }
        
        for(int j = N-1; j >= 0; j--)
        {
            
            if(a[j] == key)
            {
                result[k++] = j;
                break;
            }
            
        }
        
        return result;
    }
}
