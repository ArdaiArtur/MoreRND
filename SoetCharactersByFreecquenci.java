import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class SoetCharactersByFreecquenci {
        
        public String frequencySort(String s) {
            
            
            Map<Character,Integer>hs=new HashMap<>();
            for (var it : s.toCharArray()) {
                hs.put(it,hs.getOrDefault(it, 0)+1 );

            }  

            LinkedHashMap<Character, Integer> reverseSortedMap = new LinkedHashMap<>();
            
            //Use Comparator.reverseOrder() for reverse ordering
            hs.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())) 
                .forEachOrdered(x -> reverseSortedMap.put(x.getKey(), x.getValue()));

                String ss="";
                for (var iterable_element : reverseSortedMap.keySet()) {
                   if(hs.get(iterable_element)>1)
                   {
                    int a=hs.get(iterable_element);
                    while(a>0)
                    {
                    ss+=iterable_element;
                    a--;
                    }
                    
                   }
                   else
                   ss+=iterable_element;
                }
                return ss;

        }
}
