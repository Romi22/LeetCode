//https://practice.geeksforgeeks.org/problems/value-equal-to-index-value1330/1?page=1&difficulty[]=-2&category[]=Arrays&sortBy=submissions


//NOTE : while using index starting from from i.e. i = 1 it gives error

class Solution {
    ArrayList<Integer> valueEqualToIndex(int arr[], int n) {
        // code here
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < n; i++)
        {
            if(arr[i] == (i+1))
            list.add(i+1);
        }
        
        return list;
    }
}
