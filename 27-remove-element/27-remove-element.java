class Solution {
    public int removeElement(int[] nums, int val) {
      int arr=0;
        for(int i =0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[arr]=nums[i];
                arr++;
            }
                
        }
        return arr;
    }
}