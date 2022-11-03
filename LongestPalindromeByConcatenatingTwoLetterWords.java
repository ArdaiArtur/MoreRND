import java.util.HashMap;


public class LongestPalindromeByConcatenatingTwoLetterWords {
    public int longestPalindrome(String[] words) {
    int count=0;
        HashMap<String,Integer>hm=new HashMap<>();
        for (int i = 0; i < words.length; i++) {
                hm.put(words[i], hm.getOrDefault(words[i], 0)+1);
        }
      boolean ok=false;
        for (String word : hm.keySet()) {
        
    
            
            if(word.charAt(0)==word.charAt(1))
            {
                if(hm.get(word)%2==0)
                count=hm.get(word);
                else
                {
                    count+=hm.get(word)-1;
                     ok=true;
                }
            }
            else
            { String s=word.charAt(1)+""+word.charAt(0);
                if(hm.containsKey(s))
                {
                    count+=Math.min(hm.get(word), hm.get(s));
                
                }
            }
        }
        return ok?count*2+2:count*2;
    }
}
