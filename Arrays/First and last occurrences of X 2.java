// return -1 if list element is not present

class Solution{
    public ArrayList<Integer> firstAndLast(int arr[], int n, int x){
        // Code here
        
        int first = -1;
        int last = -1;
        
        ArrayList<Integer>  list = new ArrayList<>();
        
        list.add(0,first);
        list.add(1,last);
        
        
        for(int i = 0, j = n-1; i < n || j >= 0 ; i++, j--)
        {
            if(arr[i] == x && list.get(0) == -1)
            {
                first = i;
                list.set(0,first);
            }
            
            if(arr[j] == x && list.get(1) == -1)
            {
                last = j;
                list.set(1,last);
            }
        }
        
        
        if(list.get(0) == -1 && list.get(1) == -1)
        {
            ArrayList<Integer>  emptyList = new ArrayList<>();
            emptyList.add(0,-1);
            return emptyList;
        }
        
        else 
            return list;
        
    }
}
