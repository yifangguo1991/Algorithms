//Given an integer (signed 32 bits), write a function to check whether it is a power of 4.
//
//Example:
//Given num = 16, return true. Given num = 5, return false.


public class Solution {
    public boolean isPowerOfFour(int num) {

        double i = num;
        while(i >= 4){
        	i = i/4;
        }
        if(i == 1)
        	return true;
        else
        	return false;
        	
        //return num > 0 && (num&(num-1)) == 0 && (num & 0x55555555) != 0;
        //0x55555555 is to get rid of those power of 2 but not power of 4
        //so that the single 1 bit always appears at the odd position 
    }
}
