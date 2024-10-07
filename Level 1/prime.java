import java.util.*;
import java.io.*;

public class prime {
    static int sumofprimes(int n){

        boolean prime[]=new boolean[n+1];

        Arrays.fill(prime,true);

        for(int i=2; i*i <=n; i++)
        {
            if(prime[i] == true)
            {
                for(int j=i*2; j<=n; j+=i)
                {
                    prime[j]=false;
                }
            }
        }
            int sum=0;
            for(int j=2; j<=n; j++)
            {
                if(prime[j]){
                    sum+=j;
                }
            }
        return sum;
    }

    public static void main(String[] args) {
        int n=11;
        System.out.println(sumofprimes(n));
    }
}
