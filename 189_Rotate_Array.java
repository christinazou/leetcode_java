public class Solution {
    public void rotate(int[] nums, int k) {
        int l =nums.length;
        int[] temp=new int[l];
       for(int i=0;i<l;i++){
           temp[(i+k)%l]=nums[i];
       }
       for(int j=0;j<l;j++){
           nums[j]=temp[j];
       }
    }
}
