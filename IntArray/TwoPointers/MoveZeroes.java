//Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
//
//For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].

public class Solution {
    public void moveZeroes(int[] nums) {
        int insertIndex = 0;//指向数组中非零序列与零序列分界点，即零序列中第一个零元素
		 for(int currentIndex = 0; currentIndex < nums.length; currentIndex++){
			 if(nums[currentIndex] != 0){
			     int temp = nums[currentIndex];
			     nums[currentIndex] = nums[insertIndex];
			     nums[insertIndex] = temp;//如果当前指针指向非零，则与零序列第一个零位置交换
				 insertIndex++;//零序列中第一个零元素位置后移
			 }
				 
		 }
    }
}
