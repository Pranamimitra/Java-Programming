public class Replacecharacter {
    public static void main(String args[]){
        String s="Parbani";
        char ch1='a';
        char ch2='n';

        System.out.println(replace(s,ch1,ch2));
    }

    static String replace(String str, char ch1, char ch2)
    {
        int n=str.length();
        StringBuilder result=new StringBuilder(str);

        for(int i=0; i<n;i++)
        {
            if(result.charAt(i)==ch1)
            {
                result.setCharAt(i, ch2);;
            }
            else if(result.charAt(i)==ch2)
            {
                result.setCharAt(i, ch1);
            }
        }
        return result.toString();
    }
}
