



public class ReversVowelsOfAString {

    boolean isVowel(char c) {
        return c == 'a' || c == 'i' || c == 'e' || c == 'o' || c == 'u'
            || c == 'A' || c == 'I' || c == 'E' || c == 'O' || c == 'U';
    }
    public String reverseVowels(String s) {
        int i=0;
        int j=s.length()-1;
       
        StringBuilder sb=new StringBuilder(s);
        while (i<j) {
            char poz1=sb.charAt(i);
            char poz2=sb.charAt(j);

            if(isVowel(poz1)&&isVowel(poz2))
            {
                
                char c=sb.charAt(i);
                sb.replace(i,i+1, sb.charAt(j)+"");
                sb.replace(j,j+1, c+"");
                i++;
                j--;
            }
            else if(isVowel(poz1)&&!isVowel(poz2))
            {
                j--;
            }
            else if(!isVowel(poz1)&&isVowel(poz2))
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
