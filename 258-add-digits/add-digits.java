class Solution {
    public int addDigits(int num) {
        
       while(num/10!=0){
        int count=0;
        int original=num;
        
        while(original!=0){

        int digit=original%10;
        count+=digit;
        original=original/10;

        }
        num=count;
        
       }
       return num;

    }
}