class Solution {
    public boolean canPlaceFlowers(int[] a, int n)
    {
        int cnt=0;
     for(int i=0;i<a.length;i++)
     {
         if(a[i]==0)
         {
             if((i==0 || a[i-1]==0 ) && (i==a.length-1 || a[i+1]==0))
             {
                 cnt++;
                 a[i]=1;
             }
            
         }
        
     }
     return cnt>=n;  
    }
}