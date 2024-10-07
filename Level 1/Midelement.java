public class Midelement {
    public static void main(String args[]){
        int arr[]={12,-3,14,-56,17,13};
        int size=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>=0)  
                size++;
        }
        System.out.println(size);

        int newarr[]=new int[size];
        int j=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] > 0){
                newarr[j]=arr[i];
                j++;
            }
        }

        int mid=newarr[(size-1)/2];

        System.out.println(mid);
    }
}
