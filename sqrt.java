class Solution {
    public int mySqrt(int x) {
        int i=0;
        while(i<=x)   {
            if(i*i==x){
                return i;
            }
            else if(i*i>x){
                return i-1;
            }
                 
                 i++;
        }
        return 0;
    }
}
