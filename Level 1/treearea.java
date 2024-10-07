public class treearea {
    public static void main(String[] args) {
        int d=5;
        System.out.println(area(d));
   }

   static int area(int D)
   {
    int ar=0;
    ar=(int)(3.14*D*D);
    return ar;

    /*float area=(float)3.14*D*D;

    if(area-(int)(area)<=0.5)
    {
        return (int)area;
    }
    else
    {
        return (int)area-1;
    }*/
   }
}
