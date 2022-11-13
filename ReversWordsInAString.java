public class ReversWordsInAString {
    public String reverseWords(String s) {
        String[] ss=s.split(" ");
        String fin="";
        for (int i = ss.length-1; i >=0; i--) {
            System.out.println(ss[i]+" "+i);
            if(!ss[i].equals(""))
            fin=fin+" "+ss[i];
        }
        return fin.trim();
    }
}
