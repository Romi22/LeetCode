class Compute 
{
    static pair getMinMax(long a[], long n)  
    {
        //Write your code here
        long max = a[0];
        long min = a[0];
        
        for(int i = 1; i < n; i++)
        {
            if(a[i] > max)
                max = a[i];
            else if(a[i] < min)
                min = a[i];
        }
        
        return new pair(min,max);

    }
}
