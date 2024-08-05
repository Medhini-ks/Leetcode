class Solution {
    public String kthDistinct(String[] a, int k) {
        
        LinkedHashMap<String ,Integer> map=new LinkedHashMap<>();
        for(int i=0;i<a.length;i++)
        {
            map.put(a[i],map.getOrDefault(a[i],0 )+1);
        }

       int count=1;
        for(Map.Entry<String,Integer> entry:map.entrySet())
        {
            if(entry.getValue()==1)
            {
                if(k==count)
                {
                    return entry.getKey();
                    
                }
                count++;
            }
        }
        return "";
    }
}