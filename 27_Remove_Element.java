public class Solution {
    public int removeElement(int[] nums, int val) {
        //insert sort method
        //similar to remove 0
        int sorted=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[sorted++]=nums[i];
            }
        }
        return sorted;
    }
}
