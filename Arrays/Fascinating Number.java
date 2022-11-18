//https://practice.geeksforgeeks.org/problems/fascinating-number3751

class Solution {
    boolean fascinating(long n) {
        // code here
       
        long originalX2 = n * 2;
        long originalX3 = n * 3;
        
        int flag = 0;
        
        String originalStr = String.valueOf(n);
        String originalX2Str = String.valueOf(originalX2);
        String originalX3Str = String.valueOf(originalX3);
        
        if(originalStr.length() >= 3)
        {
        
            String str = originalStr+originalX2Str+originalX3Str;
            
            char arr[] = str.toCharArray();
            
            String compareStr = "123456789";
            
            Arrays.sort(arr);
            
            String result = new String(arr);
            
            if(result.equals(compareStr))
            {
                flag = 1;
            }
        } 
        
        if(flag == 1)
          return true;
        else
          return false;
    }
}
