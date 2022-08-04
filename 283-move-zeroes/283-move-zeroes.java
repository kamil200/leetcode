class Solution {
    public void moveZeroes(int[] nums) {
        int j=0;
        int temp;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                j++;
            }
        }
    }
}
    
//0,1,0,3,12
//1,0,0,3,12
//1,3,0,0,12