//Given an array and a value, remove all instances of that value in place and return the new length.
//
//Do not allocate extra space for another array, you must do this in place with constant memory.
//
//The order of elements can be changed. It doesn't matter what you leave beyond the new length.

public class Solution {
    public int removeElement(int[] nums, int val) {
        int lastIndex = nums.length;
		int currentIndex = 0;
		while(currentIndex < lastIndex){
			if(nums[currentIndex] == val){
				nums[currentIndex] = nums[lastIndex - 1];
				lastIndex--;
			}else{
				currentIndex++;
			}
		}
		
		return lastIndex;
    }
}
