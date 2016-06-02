//Write a function that takes a string as input and returns the string reversed.
//
//Example:
//Given s = "hello", return "olleh".

public class Solution {
    public String reverseString(String s){
		if (s == null) {
            throw new IllegalArgumentException("String cannot be null!");
        }
        if (s.isEmpty() || s.length() == 1) {
            return s;
        }
		char[] a = s.toCharArray();
		for(int i =0; i<s.length()/2; i++){
			char n = a[i]; 
			a[i] = a[s.length()-1-i];
			a[s.length()-1-i] = n;
		}
		s = new String(a);

		return s;
		//return  new StringBuilder(s).reverse().toString();
	}
}
