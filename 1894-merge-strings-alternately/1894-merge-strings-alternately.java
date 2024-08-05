class Solution {
    public String mergeAlternately(String word1, String word2) {
        // String str="";
        // int i=0;
        // int j=0;
        // while(i<word1.length() && j<word2.length())
        // {
        //     str+=word1.charAt(i);
        //     str+=word2.charAt(j);
        //     i++;
        //     j++;
        // }
        // while(i<word1.length())
        // {
        //     str+=word1.charAt(i);
        //     i++;
        // }

        // while(j<word2.length())
        // {
        //     str+=word2.charAt(j);
        //     j++;
        // }
        // return str;
        StringBuilder str=new StringBuilder();
        int i=0;
        while(i<word1.length() || i< word2.length())
        {
            if(i<word1.length())
            {
                str.append(word1.charAt(i));
            }

            if(i<word2.length())
            {
                str.append(word2.charAt(i));
            }
            i++;
        }
        return str.toString();
    }
}