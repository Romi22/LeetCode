// https://practice.geeksforgeeks.org/problems/sum-of-series2811/1?page=1&difficulty[]=-2&category[]=Arrays&sortBy=submissions

//Type casting or type promotion

class Solution {
    // function to return sum of  1, 2, ... n
    long seriesSum(int n) {
        // code here
        
        long sum = 0;
        
        sum = (long) n*(n+1)/2;
        
        return sum;
    }
}
