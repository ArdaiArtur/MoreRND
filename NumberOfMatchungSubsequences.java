import java.util.HashMap;

public class NumberOfMatchungSubsequences {
    public static void main(String[] args) {
        String s="abcde";
        String[] words={"a","bb","acd","ace"};
        numMatchingSubseq(s, words);
    }
    public static int numMatchingSubseq(String s, String[] words) {
        HashMap<String,Integer> mp=new HashMap<String,Integer>();
        
        int count=0;
        for (var ch: words) {
            mp.put(ch, mp.getOrDefault(ch,0)+1);
        }
        char ch[] = s.toCharArray();
        for(String str:mp.keySet()){
            
            char temp[] = str.toCharArray();
            int i = 0;
            int j = 0;
            
            while(i<ch.length && j<temp.length){
                if(ch[i]==temp[j]){
                    i++;
                    j++;
                }else{
                    i++;
                }
            }
            
            if(j==temp.length){
                count+=mp.get(str);
            }
            
        }    
           
           
        return count;
    }
}
