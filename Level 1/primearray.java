public class primearray {
    public static void main(String args[]){
        int[] arr={10,20,30,40,50,60,70,80,90,100};
        int n=arr.length;
        System.out.println(primesum(arr,n));
    }

    static int primesum(int arr[], int n)
    {
        int sum=0;
        for(int i=2;i<n;i++)
        {
            if(isprime(i))
            {
                System.out.println(arr[i]);
                sum+=arr[i];
            }
        }
        return sum;
    }

    static boolean isprime(int N)
    {
        for(int i=2; i<N;i++)
        {
            if(N%i==0)
            {
                return false;
            }
        }    
        return true;    
    }
}
