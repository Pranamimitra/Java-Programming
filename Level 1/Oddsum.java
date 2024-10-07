public class Oddsum {
    public static void main(String args[]){
        int[] arr={1,2,5,7,10,12,11,1};
        System.out.println(sum(arr));
    }

    static int sum(int arr[]){
        int s=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2!=0)
            {
                s+=arr[i];
            }
        }

        return s;
    }
}
