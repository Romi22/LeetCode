// https://leetcode.com/problems/remove-duplicates-from-sorted-array/

//1. once an element is encountered, you simply need to bypass its duplicates and move on to the next unique element.
class Solution {
    public int removeDuplicates(int[] nums) {
        
        int k = 1;
        
        for(int i = 0; i < nums.length-1 ; i++)
        {
            if(nums[i] == nums[i+1])
                continue;
    
            else
            nums[k++] = nums[i+1];
        }
        
        return k;
    }
}

//2. Using LinkedHashSet (maintains the insertion order )
class Solution {
    public int removeDuplicates(int[] nums) {
        
        Set<Integer> hashSet = new LinkedHashSet<Integer>();
        
        int k = 0;
        
        for(int i = 0; i < nums.length; i++)
        {
          hashSet.add(nums[i]);  
        }
        
       for(Integer i: hashSet) 
           nums[k++] = i;
        
        return k;
        
    }
}

//3. COUNTING SORT (effective when array has negative values) also constraint is within range
Constraint : -100 <= nums[i] <= 100, therefore we need an array of size 201( 100 -ve no.s + 0 + 100 +ve no.s )
      Since array index cant be negative we need to shift the negative elements i.e. if -100 to make it a positive no. we must add 100 that means if -100 is the no. 
    it's occurences will be stored at index -100+100 = 0 , so for storing the occurences of 0 we add it at index 100 i.e. count[nums[0]+100].

-100.                                     0                                             100
<-----------------------------------------|---------------------------------------------->


                                          0                                             100                                       200 
                                          <----------------------------------------------|----------------------------------------->
                                     [-100+100]                                       [0+100]                                    [100+100]
                  actualIndex = currIndex - 100(storing the occurences of -100)
        
        
class Solution {
    public int removeDuplicates(int[] nums) {
        
        int[] count = new int[201];
        int k = 0;
       
       //storing the nums in count array i.e. the occurences of 0 will be kept at index 0 and will be increamented upon encounter of the same .
        for(int i = 0; i < nums.length; i++)
        {
            count[nums[i]+100]++; 
        }
        
       // i = 0 means,check occurence of -100 
        for(int i = 0; i < count.length; i++)
        {
            //inorder to check atleast one occurences of element
            if(count[i] > 0)
            {
              //say 0 will be stored at 100th index to get the value 0 , subtract -100 (as on line 54 indexes are incremented by 100
                nums[k++] = i-100;
                
            }
        }
        
        return k;
    }
}


