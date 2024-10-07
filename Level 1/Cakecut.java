public class Cakecut {
    public static void main(String args[]){
        int n=4;
        System.out.println(numberofcuts(n));
    }

    static int numberofcuts(int n){
        
        int cuts=1+(n*(n+1))/2;
        return cuts;
    }
}
