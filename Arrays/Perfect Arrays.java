//https://practice.geeksforgeeks.org/problems/perfect-arrays4645

class Solution{
    
    public boolean IsPerfect(int a[], int n)
    {
        // Complete the function
        
        int flag = 1;
        
        for(int i = 0, j = n-1; i <= j; i++, j--)
        {
            if(a[i] != a[j])
            {
               flag = 0;
               break;
            }
        }
        
        if(flag == 0)
           return false;
        else
           return true;
    }
    
}
