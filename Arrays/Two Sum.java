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

/*class Solution {
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
    }*/
}
