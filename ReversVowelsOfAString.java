import java.util.Arrays;
import java.util.HashSet;



public class ReversVowelsOfAString {

    boolean isVowel(char c) {
        return c == 'a' || c == 'i' || c == 'e' || c == 'o' || c == 'u'
            || c == 'A' || c == 'I' || c == 'E' || c == 'O' || c == 'U';
    }
    public String reverseVowels(String s) {
        int i=0;
        int j=s.length()-1;
        HashSet<Character>hs=new HashSet<>(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));
        StringBuilder sb=new StringBuilder(s);
        while (i<j) {
            if(hs.contains(sb.charAt(i))&&hs.contains(sb.charAt(j)))
            {
                
                char c=sb.charAt(i);
                sb.replace(i,i+1, sb.charAt(j)+"");
                sb.replace(j-1,j, c+"");
                i++;
                j--;
            }
            else if(hs.contains(sb.charAt(i))&&!hs.contains(sb.charAt(j)))
            {
                j--;
            }
            else if(!hs.contains(sb.charAt(i))&&hs.contains(sb.charAt(j)))
            {
                i++;
            }
            else{
                i++;
                j--;
            }
        }
        return sb.toString();
    }
}
