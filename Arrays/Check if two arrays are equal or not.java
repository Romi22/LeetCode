// 

class Solution{
    //Function to check if two arrays are equal or not.
    public static boolean check(long A[],long B[],int N)
    {
        //Your code here
        
            Arrays.sort(A);
            Arrays.sort(B);
        
            StringBuilder sb = new StringBuilder();
            for(long i : A) {
                sb.append(i);
            }
            
            String strA = new String(sb);
            
            sb = new StringBuilder();
            for(long i : B) {
                sb.append(i);
            }
            
            String strB = new String(sb);
            
            if(strA.equals(strB))
                return true;

            else
                return false;
        
    }
}
