//https://practice.geeksforgeeks.org/problems/palindromic-array-1587115620/1?page=1&difficulty[]=-2&category[]=Arrays&sortBy=submissions


// 452 -> 254
class GfG
{
	public static int palinArray(int[] a, int n)
           {
                  //add code here.
                  for(int i = 0; i < n; i++)
                  {
                      boolean flag = testPalindrome(a[i]);
                      
                      if(flag == false)
                         return 0;
                  }
                  
                  return 1;
           }
           
    public static boolean testPalindrome(int num)
    {
        
        int temp = num;
        int rev = 0;
        
        while(num > 0)
        {
            rev = rev*10+num%10;
            num = num/10;
        }
        
        if(rev == temp)
          return true;
        else 
          return false;
    }
}
