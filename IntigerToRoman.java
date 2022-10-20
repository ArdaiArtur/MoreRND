
import java.util.LinkedHashMap;




public class IntigerToRoman {
    public String intToRoman(int num) {
       LinkedHashMap<Integer,String> hm=new LinkedHashMap<>();
       hm.put(1000, "M");
       hm.put(900, "CM");
       hm.put(500, "D");
       hm.put(400, "CD");
       hm.put(100, "C");
       hm.put(90, "XC");
       hm.put(50, "L");
       hm.put(40, "XL");
       hm.put(10, "X");
       hm.put(9, "IX");
       hm.put(5, "V");
       hm.put(4, "IV");
       hm.put(1, "I");
        StringBuilder sb=new StringBuilder();
       for (var iterable : hm.keySet()) {
        while (num>=iterable) {
            sb.append(hm.get(iterable));
            num-=iterable;
        }
       }
       return sb.toString();
    }
    
}
