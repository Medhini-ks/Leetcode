class Solution {
    public int pivotIndex(int[] nums)
    {
     int prefix[]=new int[nums.length];
     prefix[0]=nums[0];
    for(int i=1;i<nums.length;i++)
    {
        prefix[i]=prefix[i-1]+nums[i];
    }
    int leftsum=0;
    for(int i=0;i<nums.length;i++)
    {
        if(i-1>=0)
        {
            leftsum=prefix[i-1];
        }
        int rightsum=0;
        for(int j=i+1;j<nums.length;j++)
        {
            rightsum+=nums[j];
        }
        if(leftsum==rightsum)
        {
            return i;
        }
    }
    return -1;
    }
}