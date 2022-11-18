class Solution {

    public void scores(long a[], long b[]) {
        // store the answer as
        // GFG.ca=3;
        // GFG.cb=5;
        // Your code goes here
        
        int ca = 0;
        int cb = 0;
        
        for(int i = 0; i < a.length; i++)
        {
            if(a[i] > b[i])
             {
                 ca++;
             }
             else if(a[i] < b[i])
             {
                 cb++;
             }
        }
        
        GFG.ca = ca;
        GFG.cb = cb;
    }
}
