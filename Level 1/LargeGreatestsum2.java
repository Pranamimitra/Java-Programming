import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class LargeGreatestsum2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // int n=sc.nextInt();
        // int arr[]=new int[n];
        // for (int i = 0; i < n; i++) {
        //     arr[i]=sc.nextInt();
        // }
        int[] arr = {3, 2, 1, 7, 5, 4};
        System.out.println(largestgreatestsum(arr));
    }

    static int  largestgreatestsum(int arr[])
    {
        int sum=0,j=0, k=0;
        ArrayList<Integer> even=new ArrayList<>();
        ArrayList<Integer> odd=new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            if(i%2==0)
            {
                even.add(arr[i]);
            }
            else{
                odd.add(arr[i]);
            }
        }
        Collections.sort(even);
        Collections.sort(odd);

        //System.out.println(even);
        //System.out.println(odd);
        
        sum=even.get(even.size()-2)+odd.get(1);
        //System.out.println(sum);
        return sum;
    }
}
