class Solution {
    public int rangeSum(int[] a, int n, int left, int right) {
        int sub[]=new int[n * (n + 1) / 2];
        int size=0;
        for(int i=0;i<n;i++)
        {
            int sum=0;
            for(int j=i;j<n;j++)
            {
                sum+=a[j];
                sub[size++]=sum;
            }
        }
        Arrays.sort(sub);
        int total=0;
        for(int i=left-1;i<=right-1;i++)
        {
            total=(total+sub[i])%1000000007;
        }
        return total;
    }
}