
import java.util.Arrays;

public class Anagram3 {
    public static void main(String args[]){
        String str1="list";
        String str2="silent";
        System.out.println(anagramornot(str1,str2));
        //anagramornot(str1,str2);
    }

    static String anagramornot(String str1, String str2){
        if(str1.length() != str2.length())
        {
            return "no";
        }
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        // System.out.println(ch1);
        // System.out.println(ch2);
        if(Arrays.equals(ch1,ch2))
        {
            return "yes";
        }else{
            return "no";
        }
        
    }
}
