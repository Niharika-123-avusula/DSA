class Solution {
    public int maxPower(String s) {
        int i=0,j=1;
        int len=Integer.MIN_VALUE;
        while(j<s.length()){
            if(s.charAt(i)==s.charAt(j)){
                len=Math.max(len,j-i+1);
                j++;
            }
            else{
                i=j;
                //j++;
            }
        }
       
        return len==Integer.MIN_VALUE?1:len;
    }
}