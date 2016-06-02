//Given two arrays, write a function to compute their intersection.
//
//Example:
//Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2].

public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<Integer>();
        Set<Integer> result = new HashSet<Integer>();
        
        for(Integer i : nums1){
        	set.add(i);
        }
        
        for(Integer j : nums2){
        	if(set.contains(j) ){
        		result.add(j);
        	}
        }
        
        int[] r = new int[result.size()];
	    int i = 0;
	    for (Integer num : result) {
	        r[i++] = num;
	    }

		return r;
    }
}
