public class Solution {
    public void moveZeroes(int[] nums) {
        //reverse bubble sort method
        int sorted=0;
        int temp=0;
        //find !0
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
               //bubble !0 in sorted
               for(int j=i;j>sorted;j--){
                   temp=nums[j];
                   nums[j]=nums[j-1];
                   nums[j-1]=temp;
               }
               sorted=sorted+1;
            }
        }
    }
}
