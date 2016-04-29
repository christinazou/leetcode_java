public class Solution extends VersionControl {
  public int firstBadVersion(int n) {
    if(n==1){
      return 1;
    }
    int low=1;
    int high=n;
    int a=0;
    while(high-low>1){
      a=low + ((high - low) / 2);
      if(isBadVersion(a)){
        high=a;
      }else{
      low=a;
    }}
    if(isBadVersion(low)){
      return low;
    }else{
      return high;
    }
  }
}

/* Your problem is that the int (j + k) overflows (is greater than Integer.MAX_INT). try replacing
(j+k)/2
with
j + ((k - j) / 2)
These are mathematically equivelent 
(you can see that they are both just (j / 2 + k / 2) written differently. 
Another way of thinking about it is to think of starting from j and you want to go half way to k, 
so half of the difference between j and k, which is ((k - j) / 2).*/
