class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) 
    {
     ArrayList<Boolean> list   =new ArrayList<>();
     int max=candies[0];
     for(int i=1;i<candies.length;i++)
     {
        if(candies[i]>max)
        {
            max=candies[i];
        }
        
       
     }

     for(int k=0;k<candies.length;k++)
     {
        boolean ans= candies[k]+extraCandies>=max;
        list.add(ans);
     }
     return list;
    }
}