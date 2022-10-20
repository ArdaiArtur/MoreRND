import java.util.ArrayList;
import java.util.List;

public class SubstringWithConcatenationOfAllWords {
    public static void main(String[] args) {
        String s="barfoofoobarthefoobarman";
       String words[]=new String[]{ "bar","foo","the"};
        findSubstring(s, words);

    }
    
    public static List<Integer> findSubstring(String s, String[] words) {
    int wordslenght=words.length;
    int wordtot=words[0].length();
        String[]aw=new String[wordslenght];
    for (int i = 0; i < wordslenght; i++) {
        String ds=words[i];
        for (int j = 0; j < wordslenght; j++) {
           if(j!=i)
           {
            ds+=words[j];
           }
        }
        aw[i]=ds;
        System.out.print(ds +" ");
    }

    List<Integer> fin=new ArrayList<>();
    int i=0;int j=aw[0].length();
    while(j<=s.length())
    { System.out.println( i+" "+j+" i and j");
        for (var dd : aw) {
             if(s.substring(i, j).equals(dd))
             fin.add(i);
        }
       i+=wordtot;
       j+=wordtot;

    }
return fin;
    }
}
