class Solution {
    public String gcdOfStrings(String word1, String word2) {
        if(!(word1+word2).equals(word2+word1))
        return "";

        int len= gcd(word1.length(),word2.length());
        return (word1.substring(0,len));
    }

    public static int gcd(int a,int b)
    {
        while(b!=0)
        {
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
}