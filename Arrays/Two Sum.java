class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int len = nums.length;
        
        int[] arr = new int[2];
        int k = 0;

        Map<Integer,Integer> map = new HashMap<>();
        
        
        for(int i = 0 ; i < len; i++){
            map.put(nums[i],i);
        }
        
        for(int i = 0; i < len ; i++)
        {
            int key = target - nums[i];
            if(map.containsKey(key))
            {
                int mapIndex = map.get(key);
              
                //when we can't use the same element twice
                if(mapIndex != i){
                     arr[k] = map.get(key);
                     arr[k+1] = i;
                } 
            }
        }
        
        return arr;
    }
}


//BRUTE FORCE APPROACH

/*
class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int arr[] = new int[2];
       int k = 0;
        
        for(int i = 0; i < nums.length-1; i++)
        {
            for(int j = i+1; j < nums.length; j++)
            {
                if(nums[i]+nums[j] == target)
                {
                    arr[k]=i;
                    arr[k+1]=j;
                    break;
                }
            }
        }
        
        return arr; 
    }
    */


//OPTIMISED SOLUTION

/*
 
 class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        //use map to store array elements
        Map<Integer,Integer> map = new HashMap<>();
        
        for(int i=0;i<nums.length;i++)
        {
          //before inserting into the map try to find if the difference of the target and the current number is already in map
            if(map.containsKey(target - nums[i]))
            {
			//if yes return 
               return new int[]{map.get(target - nums[i]),i};                   
            }
            //if not insert into the map
              map.put(nums[i],i);
        }
        
      
        
        return null;
        
    }
}
*/
}
