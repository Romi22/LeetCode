//https://practice.geeksforgeeks.org/problems/count-of-smaller-elements5947/1?page=1&difficulty[]=-2&category[]=Arrays&sortBy=submissions

class Compute {
    
    public long countOfElements(long arr[], long n, long x)
    {
        long count = 0;
        
        for(int i = 0; i < n; i++)
        {
            if(arr[i] <= x)
               count ++;
        }
        
        return count;
    }
}
