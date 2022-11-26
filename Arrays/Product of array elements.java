class GfG
{
    public static Long product(Long arr[], Long mod, int n)
    {
        //yout code here
        
        long prod = arr[0];
    
        for(int i = 1; i < n; i++)
        {
            prod = (prod * arr[i]) % mod;
        }
        
        return prod;
    }
}
