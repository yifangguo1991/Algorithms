//Given a sorted array, remove the duplicates in place such that each element appear only once and return the new length.
//
//Do not allocate extra space for another array, you must do this in place with constant memory.
//
//For example,
//Given input array nums = [1,1,2],
//
//Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively. It doesn't matter what you leave beyond the new length.


public class Solution {
    public int removeDuplicates(int[] nums) {
        int lastIndex = 0;
		for(int currentIndex = 0; currentIndex < nums.length; currentIndex++){
			if(lastIndex < 1 || nums[currentIndex] != nums[currentIndex-1]){
				nums[lastIndex] = nums[currentIndex];
				lastIndex++;
			}
		}
		
		
		
		return lastIndex;
    }
}
