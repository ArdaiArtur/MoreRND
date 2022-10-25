public class CheckIFTwoStringsAreEqual {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String s="",l="";
        for (String string : word1) {
            s+=string;
        }
        for (String string : word2) {
            l+=string;
        }
        return s.equals(l)?true:false;
    }
}
