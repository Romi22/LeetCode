class Solution {
    int minDist(int a[], int n, int x, int y) {
        // code here
        
        
        int dx = -1;
        int dy = -1;
        
        int distance = n+1;
        
        for(int i = 0; i < n; i++)
        {
            if(a[i] == x)
                 dx = i;
                 
            else if(a[i] == y)
                 dy = i;
                 
            
            if(dx != -1 && dy != -1)
                {
                    distance = Math.min(distance,Math.abs(( Math.abs(dx)-Math.abs(dy))));
                }
        }
        
        return distance == n+1 ? -1:distance;
    }
}
