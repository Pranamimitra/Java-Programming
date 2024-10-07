public class Superiorelement {
    public static void main(String args[]){
        int arr[]={7,9,5,2,8,7};
        System.out.println(superior(arr));
    }

    static int superior(int arr[])
    {
        int sup=0, ans=0;
        for(int i=arr.length-1; i>=0;i--){
            if(arr[i]>sup)
            {
                sup=arr[i];
                ans++;
            }
        }

        return ans;
    }
}
