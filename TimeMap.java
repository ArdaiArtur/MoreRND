import java.util.HashMap;


public class TimeMap {
   HashMap<String, HashMap<Integer,String>>fin=new HashMap<>();
   String timestamp_prev="";
    public TimeMap() {
        
    }
    
    public void set(String key, String value, int timestamp) {
       if(!fin.containsKey(key))
       {
        fin.put(key, new HashMap<Integer,String>());
       }
       fin.get(key).put(timestamp, value);
       
       
    }
    
    public String get(String key, int timestamp) {
        if(!fin.containsKey(key))
        {
            return "";
        }

        for (int currTime = timestamp; currTime >= 1; --currTime) {
            
            if (fin.get(key).containsKey(currTime)) {
                return fin.get(key).get(currTime);
            }
        }
        
        return "";
    }   

}
