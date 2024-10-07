import java.lang.Math;
public class Tosingledigit {
    public static void main(String args[]){
        int n=12;
        System.out.println(answer(n));
    }

    static int answer(int n)
    {
        while (n>9)
        {
            if(n%2!=0){
                n=(int)Math.floor(n/2);
            }
            else if(n%2==0){
                n=(int)Math.floor((n-2)/2);
            }
            else
                return n;
        }


        return n;
    }
}
