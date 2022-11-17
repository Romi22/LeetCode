// https://practice.geeksforgeeks.org/problems/display-longest-name0853/1?page=1&difficulty[]=-2&category[]=Arrays&sortBy=submissions

class GFG {
    String longest(String names[], int n) {
        
        String longest = names[0];
        
        if(n > 1)
        {
            for(int i = 0; i < n-1; i++)
            {
                if(names[i].length() < names[i+1].length())
                {
                   longest = names[i+1]; 
                }
            }
        }
        
        return longest;
    }
}
