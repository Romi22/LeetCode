class GFG
{
    ArrayList<Long> find(long arr[], int n, int x)
    {
        // code here
        
        ArrayList<Long> list = new ArrayList<>();
        
        long first = -1;
        long last = -1;
       
        list.add(0,first);
        list.add(1,last);
       
        
        for(int i = 0, j = n-1; i < n-1 || j >=0 ; i++, j-- )
        {
            if(arr[i] == x && list.get(0) == -1)
            {
                first = i;
                list.set(0,first);
            }
            
            if(arr[j] == x && list.get(1) == -1) 
            {
                last = j;
                list.set(1,last);
            }
                
        }
        
        return list;
    }
}
