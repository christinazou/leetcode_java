//how to use only O(k) extra space?
public class Solution {
    public List<Integer> getRow(int rowIndex) {
       LinkedList rs=new LinkedList();
       int[][] a=new int[rowIndex+2][rowIndex+2];
       a[1][1]=1;
        for(int i=1;i<=rowIndex+1;i++){
            for(int j=1;j<=i;j++){
                if(i>=2){
                    a[i][j]=a[i-1][j-1]+a[i-1][j];
                }
                if(i==rowIndex+1){rs.add(a[i][j]);}
            }
        }
        return rs;
    }
    
}
