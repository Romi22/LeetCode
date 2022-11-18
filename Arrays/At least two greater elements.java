//https://practice.geeksforgeeks.org/problems/at-least-two-greater-elements4625

class Solution {
    public long[] findElements( long a[], long n)
    {
        // Your code goes here'
        int length = (int) n;
        long[] result = new long[length - 2];
        int k = 0;
        Arrays.sort(a);
        
        for(int i = 0; i < n-2; i++)
        {
            result[k++] = a[i];
        }
        
        return result;
    }
}
