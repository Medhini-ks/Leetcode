class Solution {
    public boolean canBeEqual(int[] target, int[] a) 
    {
      
        HashMap<Integer,Integer>map1=new HashMap<>();
        HashMap<Integer,Integer>map2=new HashMap<>();

        for(int i=0;i<target.length;i++)
        {
            map1.put(target[i],map1.getOrDefault(target[i],0)+1);
        }
        for(int i=0;i<a.length;i++)
        {
            map2.put(a[i],map2.getOrDefault(a[i],0)+1);
        }
        return map1.equals(map2);
    }
}