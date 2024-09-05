class Solution {
    public boolean isPalindrome(int x)
    { int rem=0;
    int r=x;
        while(x>0)
        { int n=x%10;
          rem=(rem*10)+n;
          x=x/10;
        } 
        if(rem==r)
        return true;
        else return false;
    }
}