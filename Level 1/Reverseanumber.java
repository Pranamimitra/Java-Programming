public class Reverseanumber {
    public static void main(String args[])
    {
        int n=4;
        int first=0, second=1;
        int sum=0;
        //System.out.println(first);
        //System.out.println(second);
        for(int i=2;i<=n;i++){
            sum=first+second;
            first=second;
            second=sum;
        }
        System.out.println(sum);
    }
}
