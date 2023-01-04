
import java.util.Arrays;
import java.util.HashSet;

public class DetermenIfStringHalfAreAlike {
    public static void main(String[] args) {
        String a= "AbCdEfGh";
        System.out.println(halvesAreAlike(a)?"true":"false");
    }
    public static boolean halvesAreAlike(String s) {
     
        HashSet<Character>hs=new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
        int half=s.length()/2;
        int c1=0;
        int c2=0;
      /*   for (int i = 0; i < s.length(); i++) {
            if(hs.contains(s.charAt(i))&&i<=half)
            {
                c1++;
            }
            if(hs.contains(s.charAt(i))&&i>half)
            {
                c2++;
                if(c2>c1) return false;
            }
        }
        */
        int i=0;
        while (half<s.length()) {

            if(hs.contains(s.charAt(i)))
            {
                c1++;
            }
            if(hs.contains(s.charAt(half)))
            {
                c2++;
                
            }
            i++;
            half++;
        }


        System.out.println(c1+" "+c2);
        return c1==c2;
    }
}
