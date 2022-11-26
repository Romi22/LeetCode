class Solution
{
    long minValueToBalance(long a[] ,int n)
    {
        long sumLeft = 0;
        long sumRight = 0;
        long diff = 0;

        for(int i = 0; i< n/2; i++)
        {
            sumLeft+= a[i];
        }
        
        for(int j = n/2; j < n; j++)
        {
            sumRight+= a[j];
        }
        
        diff = Math.abs(sumLeft - sumRight);
        
        return diff;
    }
}
