/**
 * 求1~n阶乘之和
 */
public class SumFactorial
{
  public static void main(String args[])
  {
  	long f = 1;
  	long sum = 0;
  	int n = 10;

  	for (int i = 1; i <= n; i++)
  	{
  		f *= i;
  		sum += f; 
  	}

  	System.out.println("sum = " + sum);
  }
}
