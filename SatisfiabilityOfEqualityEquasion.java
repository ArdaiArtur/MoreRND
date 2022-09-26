import java.util.HashMap;

public class SatisfiabilityOfEqualityEquasion {
    public boolean equationsPossible(String[] equations) {
       HashMap<Character,Character>good=new HashMap<>();
       HashMap<Character,Character>not=new HashMap<>();

       for (String s : equations) {
            if(s.charAt(1)=='!')
            {
                if(s.charAt(0)==s.charAt(3))
                return false;
                if(!not.containsKey(s.charAt(0)))
                {
                 not.put(s.charAt(0), s.charAt(3));
                
                }
                
                if(!not.containsKey(s.charAt(3)))
                {
            
                 not.put(s.charAt(3), s.charAt(0));
                }
                
            }
            else
            {
                if(!good.containsKey(s.charAt(0)))
                {              
                    good.put(s.charAt(0), s.charAt(3));               
                  
                }
                if(!good.containsKey(s.charAt(3)))
                {              
                              
                    good.put(s.charAt(3), s.charAt(0));
                }
            }

       }
       if(good.isEmpty())return true;
       if(not.isEmpty()) return true;

       for (var go : not.keySet()) {
       if(good.containsKey(go))
       {
        not.put(not.get(go), good.get(go));
      
       }
       

   }
       return true;
    }
}
