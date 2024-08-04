class Solution {
    public String reverseVowels(String s) {
        char str[]=s.toCharArray();

        int i=0;
        int j=str.length-1;
        while(i<j)
        {
            if(!isVowel(str[i])  && !isVowel(str[j]))
            {
                i++;
                j--;
            }
            else if(!isVowel(str[i]))
            {
                i++;
            }
            else if(!isVowel(str[j]))
            {
                j--;
            }
            else
            {
                char temp=str[i];
                str[i]=str[j];
                str[j]=temp;
                i++;
                j--;
            }
            
        }
        String vowel="";
            for(int k=0;k<str.length;k++)
            {
                vowel+=str[k];
            }
            return vowel;

    }
 public static boolean isVowel(char c)
{
    return (c=='A' || c=='a' || c=='E' || c=='e' ||c=='I'||c=='i'||c=='O'||c=='o'||c=='U'||c=='u' );
}
}