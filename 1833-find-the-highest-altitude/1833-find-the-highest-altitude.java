class Solution {
    public int largestAltitude(int[] gain) 
    {
     int n=gain.length;
        int b[]=new int[n];
        b[0]=gain[0];
            for(int i=1;i<n;i++)
            {
                b[i]=b[i-1]+gain[i];
            }
        int max=b[0];
        for(int i=0;i<n;i++)
        {
            if(b[i]>max)
                max=b[i];
        }
        if(max<0)
            return 0;
        else
            return max;
    }
}