import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * FindeDuplicateFilesInSistem
 */
public class FindeDuplicateFilesInSistem {

    public List<List<String>> findDuplicate(String[] paths) {
        HashMap<String,List<String>>hm=new HashMap<>();
        for (String string : paths) {
            String []full=string.split(" ");
            for (int i = 1; i < full.length; i++) {
                String[] word=full[i].split("\\(");
                word[1]=word[1].replace(")", "");
                List<String> lis=hm.getOrDefault(word[1],new ArrayList<String>() ); 
                lis.add(full[0]+"/"+word[0]);
                hm.put(word[1], lis);
            }
        }
        List < List < String >> res = new ArrayList < > ();
        for (String key: hm.keySet()) {
            if (hm.get(key).size() > 1)
                res.add(hm.get(key));
        }
        return res;

    }
}