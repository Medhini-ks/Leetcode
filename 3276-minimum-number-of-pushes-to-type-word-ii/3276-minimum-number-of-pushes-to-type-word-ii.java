class Solution {
    public int minimumPushes(String word) 
    {
     HashMap<Character,Integer> map=new HashMap<>();
    for(int i=0;i<word.length();i++)
    {
        map.put(word.charAt(i),map.getOrDefault(word.charAt(i), 0)+1);
    }
    

    ArrayList<Integer> li=new ArrayList<>();
    for (Map.Entry<Character, Integer> entry : map.entrySet()) {
        li.add( entry.getValue());
    }
    Collections.sort(li);
    Collections.reverse(li);
    int ans=0;
    int count=0;
    for(Integer num:li)
    {
        
        if(count<8)
        {
            ans+=num*1;
        }
        else if(count<16)
        {
            ans+=num*2;
        }
        else if(count<24)
        {
            ans+=num*3;
        }
        else
        {
            ans+=num*4;
        }
        count++;
    }
    return ans;
       
    }
}