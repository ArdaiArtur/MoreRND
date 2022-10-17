import java.util.HashSet;

public class CheckIfSentenceIsPanagram {
    public boolean checkIfPangram(String sentence) {
     HashSet<Character> hs=new HashSet<>();
     for (Character character : sentence.toCharArray()) {
        hs.add(character);
     }   
     if(hs.size()==26) return true;
     return false;
    }
}
