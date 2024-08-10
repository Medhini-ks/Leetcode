class Solution {
    public int[] productExceptSelf(int[] nums) 
    {
        int prefix[]=new int[nums.length];
        int sufix[]=new int[nums.length];
        int res[]=new int[nums.length];
        prefix[0]=1;
        sufix[nums.length-1]=1;

        for(int i=1;i<nums.length;i++)
        {
           prefix[i]=prefix[i-1]*nums[i-1];
        }
        for(int j=nums.length-2;j>=0;j--)
        {
            sufix[j]=sufix[j+1]*nums[j+1];
        }
        for(int i=0;i<nums.length;i++)
        {
            res[i]=prefix[i]*sufix[i];
        }
        return res;
    }
}