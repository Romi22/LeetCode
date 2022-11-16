//https://leetcode.com/problems/merge-sorted-array/


//1. BRUTE FORCE APPROACH
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int j = 0;
        
        for(int i = m; i < m+n; i++)
        {
            nums1[i] = nums2[j++];
        }
        
        Arrays.sort(nums1);
    }
}

//2. 
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int i = m-1;
        int j = n-1;
        int k = m+n-1;
        
        while(i>=0 && j>=0)
        { 
          if(nums1[i] > nums2[j])
              nums1[k--] = nums1[i--];
          else
            nums1[k--] = nums2[j--];
        }
        
        if(i>=0)
        {
            while(i>=0)
            {
                nums1[k--] = nums1[i--];
            }
        }
        
        else if(j>=0)
        {
            while(j >= 0)
            {
                nums1[k--] = nums2[j--];
            }
        }
    }
}

//3. Using Condition expression
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int last1 = m-1, last2 = n-1, tail = m+n-1;
        
        while(last1>=0 && last2>=0)
        { 
          nums1[tail--] = (nums1[last1] > nums2[last2]) ? nums1[last1--] : nums2[last2--];
        }
        
    
            while(last1>=0)
            {
                nums1[tail--] = nums1[last1--];
            }
    
    
            while(last2 >= 0)
            {
                nums1[tail--] = nums2[last2--];
            }
    }
}



//3. Fatsest most optimized solution
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int last1 = m-1, last2 = n-1, tail = m+n-1;
        
        while(last1>=0 && last2>=0)
        { 
          nums1[tail--] = (nums1[last1] > nums2[last2]) ? nums1[last1--] : nums2[last2--];
        }
        
            while(last2 >= 0)
            {
                nums1[tail--] = nums2[last2--];
            }
    }
}
