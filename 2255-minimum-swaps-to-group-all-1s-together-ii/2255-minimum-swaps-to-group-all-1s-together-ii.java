class Solution {
    public int minSwaps(int[] nums)
    {
        int count1=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==1)
            count1++;
        }
            int window=count1;
            int count0=0;
        for(int i=0;i<window;i++)
        {
            if(nums[i]==0)
            {
                count0++;
            }
        } 
            int min=count0;
        for(int i=window;i<nums.length+window;i++)
        {
            if(nums[i%nums.length]==0)
            {
                count0++;
            }
            if(nums[i-window]==0)
            {
                count0--;
            }
            min=Math.min(min,count0);
        }  
        return min;

    }
}