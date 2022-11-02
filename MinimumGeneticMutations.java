
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
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
        HashSet<String>hs=new HashSet<>();
        hs.add(start);
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

    public int minMutationGood(String start, String end, String[] bank) {
        Queue<String>qu=new LinkedList<>();
        HashSet<String>hs=new HashSet<>();
        qu.add(start);
        hs.add(start);
        int steps=0;
        while(!qu.isEmpty())
        {
            int nodes=qu.size();
            for (int i = 0; i < nodes; i++) {
                String node=qu.poll();
                if(node.equals(end))
                {
                    return steps;
                }

                for (char c: new char[] {'A', 'C', 'G', 'T'}) {
                    for (int j = 0; j < node.length(); j++) {
                        String neighbor = node.substring(0, j) + c + node.substring(j + 1);
                        if (!hs.contains(neighbor) && Arrays.asList(bank).contains(neighbor)) {
                            qu.add(neighbor);
                            hs.add(neighbor);
                        }
                    }
                }



            }

        }
        return -1;
    
    }


}
