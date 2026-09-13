class Solution {
    public boolean isPowerOfTwo(int n) {
        for(int i =0;i<=30;i++){
            int result=(int)Math.pow(2,i);
            if(result==n){
                return true;

            }
           
        }
        return false;
        
    }
}