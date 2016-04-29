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
