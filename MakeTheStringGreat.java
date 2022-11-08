public class MakeTheStringGreat {
    public String makeGood(String s) {
        StringBuilder sb=new StringBuilder(s);
       int i=1;
       int j=s.length();
       while(i<j)
       {if(i<1)
           i=1;
             if(sb.length()>1)
         if(sb.charAt(i-1)-97==sb.charAt(i)-65 ||sb.charAt(i-1)-65==sb.charAt(i)-97)
           {
               
               sb.delete(i-1, i+1);
               i-=2;
               j-=2;
           }
           i++;
       }
       return sb.toString();
   }
}
