public class arraystring {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8};
        int n=arr.length;
        String ans=strarr(arr,n);
        System.out.println(ans);
    }

    public static String strarr(int arr[], int n)
    {
        String ans="";
        for(int i=0;i<arr.length; i++)
        {
            if((i+1)%2==0)
            {
                ans+="even";
            }
            else{
                ans+="odd";
            }
        }
        return ans;
    }
}
