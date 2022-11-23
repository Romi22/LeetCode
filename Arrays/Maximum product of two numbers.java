class Solution {
    int maxProduct(int arr[], int n) {
        // code here
        Arrays.sort(arr);
	        int res=(arr[n-1]*arr[n-2]);
	        return res;
    }
}
