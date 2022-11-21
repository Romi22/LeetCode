class Solution {
    boolean checkTriplet(int[] arr, int n) {
        // code here
        Arrays.sort(arr);
        for(int i = 0; i < n-2; i++)
        {
            for(int j = i+1; j < n-1; j++)
            {
                for(int k = j+1; k < n; k++)
                {
                    
                    if((Math.pow(arr[i],2) + Math.pow(arr[j],2)) == Math.pow(arr[k],2))
                    {
                        return true;
                    }
                }
            }
        }
        
        return false;
    }
}
