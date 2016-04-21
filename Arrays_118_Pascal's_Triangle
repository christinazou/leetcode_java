public class Solution {
    public List<List<Integer>> generate(int numRows) {
      //use arrays to do the math, use LinkedList to show the result
       LinkedList rs=new LinkedList();
       int[][] a=new int[numRows+1][numRows+1];
       if(numRows>0){
       a[1][1]=1;
       }
        for(int i=1;i<=numRows;i++){
            LinkedList subrs=new LinkedList();
            for(int j=1;j<=i;j++){
            //if the row<=2, no need for real calculation
                if(i>=2){
                    a[i][j]=a[i-1][j-1]+a[i-1][j];
                }
                subrs.add(a[i][j]);
            }
            rs.add(subrs);
        }
        return rs;
    }
}
