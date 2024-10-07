public class Secondlargestoccurence {
    public static void main(String args[]){
        int arr[]={1,2,3,4,4,4,4,4,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8};

        System.out.println(countoccurence(arr));
    }

    static int countoccurence(int arr[])
    {
        int count=0;
        int n=arr.length;
        int largest=arr[n-1];
        for(int i=n-2;n>=0;i--){
            if(arr[i]<largest){
                largest=arr[i];
                break;
            }
        }
        System.out.println(largest);
        for(int i=0;i<n-1;i++){
            if(arr[i]==largest)
            {
                count++;
            }
        }
        return count;
    }
}
