class Solution {
    public double findMaxAverage(int[] a, int k) {
        double sum=0;
        for(int i=0;i<k;i++)
        {
           sum+=a[i];
        }
         double maxi=sum;
        for(int i=k;i<a.length;i++)
        {
            sum+=a[i];
            sum-=a[i-k];
            maxi=Math.max(maxi,sum);
            
        }
        return maxi/k;
    }
}