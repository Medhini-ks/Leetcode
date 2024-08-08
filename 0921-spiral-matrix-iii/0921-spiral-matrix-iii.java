class Solution {
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int [][]res=new int[rows*cols][2];

        int directions[][]={
                    {0,1},//East
                    {1,0},//South
                    {0,-1},//West
                    {-1,0}//North
                };
        int index=0;
        res[index++]=new int[]{rStart,cStart};
        int dir=0;
        int steps=0;

        while(index<rows*cols)
        {
            if(dir==0 || dir==2)
            {
                steps++;
            }
            for(int count=0;count<steps;count++)
            {
                rStart+=directions[dir][0];
                cStart+=directions[dir][1];

                if(rStart>=0 && rStart<rows && cStart>=0 && cStart<cols)
                {
                    res[index++]=new int[]{rStart,cStart};
                }
            }
            dir=(dir+1)%4;
        }
        return res;
    }
}