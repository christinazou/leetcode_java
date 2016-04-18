
import java.util.Arrays;

public class MainArrays
{
  public static void main(String[] args)
  {
    int[] t1= {-1};
    int[] t2= {1,2,3,4,5};
    A a= new A();
    int[] b1=a.rotate(t2,2);
    System.out.println("Real prime numbers : " + Arrays.toString(b1));
    int[] a1=a.rotate(t1,2);
    System.out.println("Real prime numbers : " + Arrays.toString(a1));
  }
}
