import java.math.BigInteger;
import java.util.Scanner;

public class Test
{
    public static void main (String[] args) throws java.lang.Exception
    {
        BigInteger a1 = BigInteger.valueOf(998244353);
        BigInteger[] arr = new BigInteger[1000001];
        arr[0] = BigInteger.valueOf(1);
        for(int i = 1 ; i < 1000001 ;i++)
        {
            BigInteger a2 = arr[i-1].mod(a1);
            BigInteger a3 = BigInteger.valueOf(i).mod(a1);

            arr[i] = a3.multiply(a2).mod(a1);
        }
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0)
        {
            int n = sc.nextInt();
            BigInteger ans = BigInteger.valueOf(0);
            for(int i = 0; i < n;i++)
            {
                int a=sc.nextInt();
                BigInteger temp = arr[a].mod(a1);
                ans = ans.add(temp).mod(a1);
            }
            System.out.println(ans);
            t--;
        }
    }

}