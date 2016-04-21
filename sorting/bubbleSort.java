public static  int[] bubbleSort(int ar[]){
  for (int i = (ar.length - 1); i >= 0; i--){
    for (int j = 1; j <= i; j++){
      if (ar[j-1] > ar[j]){
      int temp = ar[j-1];
      ar[j-1] = ar[j];
      ar[j] = temp;
    } }
    for(int index: ar) {
      System.out.print(index);
    }
    System.out.println();
  } 
  return ar;
}
