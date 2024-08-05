class Solution {
    public String kthDistinct(String[] a, int k) {
        ArrayList<String> list=new ArrayList<>();
        LinkedHashMap<String ,Integer> map=new LinkedHashMap<>();
        for(int i=0;i<a.length;i++)
        {
            map.put(a[i],map.getOrDefault(a[i],0 )+1);
        }
        for(Map.Entry<String,Integer> entry:map.entrySet())
        {
            if(entry.getValue()==1)
            {
                list.add(entry.getKey());
            }
        }
        if(list.isEmpty() || k>list.size())
        return "";
        return list.get(k-1);
    }
}