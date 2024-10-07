public class Recursion {
    static int sum=0;
    public static void main(String args[]){
        //System.out.println(sum(5));
        //System.out.println(productofdigits(1342));
        reverse(1342);
        System.out.println(sum);
    }

    //1
    static void func(int n)
    {
        if(n==0)
        {
            return;
        }

        func(n-1);
        System.out.println(n);
    }
    
    //2
    static int fact(int n)
    {
        while(n <= 0)
        {
            return 1;
        }
        return n*fact(n-1);
    }

    //3
    static int sum(int n)
    {
        while(n <=0)
        {
            return 0;
        }
        return n+sum(n-1);
    }

    //4
    static int sumofdigits(int n)
    {
        while(n <=0)
        {
            return 0;
        }
        return (n%10)+sumofdigits(n/10);
    }

    //5
    static int productofdigits(int n)
    {
        while(n <=0)
        {
            return 1;
        }
        return (n%10)*productofdigits(n/10);
    }

    //6
    //static int sum=0;
    static void reverse(int n)
    {
        // int s=0;
        // while (n>0)
        // {
        //     s=s*10+(n%10);
        //     n/=10;
        // }
        // return s;
        if(n==0){
            return;
        }

        sum=sum*10+(n%10);
        reverse(n/10);

    }
}

