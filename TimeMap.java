import java.util.HashMap;


public class TimeMap {
   HashMap<String, HashMap<Integer,String>>fin=new HashMap<>();
   String timestamp_prev="";
    public TimeMap() {
        
    }
    
    public void set(String key, String value, int timestamp) {
        HashMap<Integer,String>hs=new HashMap<>();
        hs.put(timestamp, value);
        fin.put(key, hs);
    }
    
    public String get(String key, int timestamp) {
        if(fin.containsKey(key))
        {
            var x=fin.get(key);
            for (var keys : x.keySet()) {
                if(timestamp>keys)
                {
                    timestamp_prev=x.get(keys);
                }
            }
        }
        return timestamp_prev;
    }   

}
