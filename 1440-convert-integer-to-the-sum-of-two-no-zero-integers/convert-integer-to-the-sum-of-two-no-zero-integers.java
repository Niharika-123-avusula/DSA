class Solution {
    public int[] getNoZeroIntegers(int n) {
       int i=1,z=n-i;
       while(z>=i){
       if(!(i + "").contains("0") && !(z + "").contains("0")){
        return new int[]{i,z};
       }
       else{
        i++;
        z--;
       }
       }
       return new int[]{};
    }
}