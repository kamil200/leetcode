class Solution {
    public int searchInsert(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++){
			// if found, return that index (simple af)
            if(nums[i] == target){
                return i;
            }
			// since it's sorted array, if target is less than current nums[i], return that "i" because the target value should've been there
            else if(target < nums[i]){
                return i;
            }
			
			// if reached end of iteration, return length of nums cuz the target is largest and should be at last
            else if(i == nums.length - 1) return nums.length;
        }
		
		// this return statement never gets executed but just to make java happy
        return -1;
    }
}