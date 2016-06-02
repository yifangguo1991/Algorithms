//Write a function that takes a string as input and reverse only the vowels of a string.
//
//Example 1:
//Given s = "hello", return "holle".
//
//Example 2:
//Given s = "leetcode", return "leotcede".

public class Solution {
    public String reverseVowels(String s) {
    char[] a = s.toCharArray();
    char n = 0;
    int i=0,j=s.length()-1; 
    
    while(i<j){
    	
    	if("aeiouAEIOU".contains(String.valueOf(a[i]))){
    		if("aeiouAEIOU".contains(String.valueOf(a[j]))){
    			n = a[i];
        		a[i] = a[j];
        		a[j] = n;
        		i++;
        	}
    		j--;
    	}else
    		i++;
    	
    }

	return String.valueOf(a);
    }
}
