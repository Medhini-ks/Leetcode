class Solution {
    public int rangeSum(int[] a, int n, int left, int right) {
        ArrayList<Integer> sub=new ArrayList<>();
        
        for(int i=0;i<n;i++)
        {
            int sum=0;
            for(int j=i;j<n;j++)
            {
                sum+=a[j];
                sub.add(sum);
            }
        }
        Collections.sort(sub);
        int total=0;
        for(int i=left-1;i<=right-1;i++)
        {
            total=(total+sub.get(i))%1000000007;
        }
        return total;
    }
}