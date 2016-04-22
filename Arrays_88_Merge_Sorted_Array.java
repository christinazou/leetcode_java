public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] rs= new int[m+n];
        int c1=0,c2=0;
        for(int i=0;i<m+n;i++){
            if(c1<m&&c2<n){
                if(nums1[c1]<nums2[c2]){
                   rs[i]=nums1[c1];
                   c1++; 
                }
                else{
                rs[i]=nums2[c2];
                c2++;
                }
            }
            else if(c1<m){
                rs[i]=nums1[c1];
                c1++; 
            }
            else if(c2<n){
                rs[i]=nums2[c2];
                c2++;
            }
        }
        System.arraycopy(rs, 0, nums1, 0, n+m);
    }
}
