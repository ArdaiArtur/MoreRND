import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class TimeMap {
    HashSet<String> key=new HashSet<>();
   Queue<String> value=new LinkedList<>();
   HashSet<Integer> timestamp=new HashSet<>();
   String timestamp_prev="";
   int tp;
    public TimeMap() {
        
    }
    
    public void set(String key, String value, int timestamp) {
        this.timestamp.add(timestamp);
        this.key.add(key);
        this.value.add(value);
        this.tp=timestamp;
    }
    
    public String get(String key, int timestamp) {
        if(this.key.contains(key)&&(this.timestamp.contains(timestamp)||tp<timestamp))
        if(value.size()>0)
        {
        timestamp_prev=value.remove();
        }
        return timestamp_prev;
    }   

}
