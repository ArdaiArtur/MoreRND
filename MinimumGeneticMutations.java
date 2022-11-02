import java.lang.Thread.State;
import java.util.Stack;

public class MinimumGeneticMutations {
    public int minMutation(String start, String end, String[] bank) {
       int count=0;
       if(bank.length==0) return -1;
       Stack<String> st=new Stack<>();
        for (int i = 0; i < end.length(); i++) {
            if(start.charAt(i)!=end.charAt(i))
            {
                count++;
                for (String string : bank) {
                    if(string.charAt(i)==end.charAt(i))
                    st.add(string);
                }
            }
        }
        int coco=0;
        String s="";
        for (int i = 0; i < end.length(); i++) {
            if(start.charAt(i)!=end.charAt(i))
            {
                while (coco!=1&&st.size()>0) {
                    
                
                coco=0;
                 s=st.pop();
                for (int j = 0; j < s.length(); j++) {
                    if(start.charAt(j)!=s.charAt(j))
                    {
                        coco++;
                    }
                }
                
                 }
                 if(coco==1)
                 start=s;
            }
        }
        System.out.println(start+" "+coco+" "+end);
        return start.equals(end)? count:-1;
    }
}
