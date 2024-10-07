import java.util.*;
public class Tobinary {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        //int N = 4;
        System.out.println(binary(N));
    }

    static String binary(int n){
        /*int d, num = 0, factor = 1;
        while(n > 0){
            d = n % 2;
            num = num + d * factor;
            factor *= 10;
            n = n / 2;
        }
        return num;*/

        String ans= " ";

        while(n>0){
            ans=((n%2)==0 ? "0" : "1")+ans;
            n=n/2;
        }
        return ans;
    }
}
