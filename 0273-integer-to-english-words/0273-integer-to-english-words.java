class Solution {
    public String numberToWords(int num) {
        return num==0?"Zero": calculate(num);
    }
    public String calculate(int num)
    {
        String ones[]={"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
        String belowtwenty[]={"Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
        String belowhundred[]={"","Ten","Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety"};
        int billion=1000000000;
        int million=1000000;
        int thousand=1000;
        int hundred=100;


        StringBuilder str=new StringBuilder();

        if(num<10)
        {
            str.append(ones[num]);
        }
        else if(num<20)
        {
            str.append(belowtwenty[num-10]);
        }
        else if(num<hundred)
        {
           str.append(belowhundred[num/10]).append(" ").append(calculate(num%10));
        }
        else if(num<thousand)
        {
            str.append(calculate(num/hundred)).append(" ").append("Hundred").append(" ").append(calculate(num%hundred));
        }
        else if(num<million)
        {
            str.append(calculate(num/thousand)).append(" ").append("Thousand").append(" ").append(calculate(num%thousand));
        }
        else if(num<billion)
        {
            str.append(calculate(num/million)).append(" ").append("Million").append(" ").append(calculate(num%million));
        }
        else {
            str.append(calculate(num/billion)).append(" ").append("Billion").append(" ").append(calculate(num%billion));
        }
        return str.toString().trim();

    }
}