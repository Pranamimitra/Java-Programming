import java.util.Scanner;

public class DiffSum1 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int value=differenceofSum(m, n);
        System.out.println(value);

    }
 
    static int differenceofSum(int m, int n)
    {
        int syes=0, sno=0;
        for(int i=1; i<=n;i++)
        {
            if(i%m==0)
            {
                syes=syes+i;
            }
            else{
                sno=sno+i;
            }
        }
        return Math.abs(sno-syes);
    }
}
