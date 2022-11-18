//https://practice.geeksforgeeks.org/problems/smaller-and-larger4005

class Solve {
    int[] getMoreAndLess(int[] arr, int n, int x) {
        // code here
        
        int[] result = new int[2];
    
        
        for(int i = 0; i < n; i++)
        {
            if(arr[i] <= x)
                result[0]++;
                
            if(arr[i] >= x)
                result[1]++;
                
        }
        
        return result;
    }
}
