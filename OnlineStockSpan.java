import java.util.Stack;

public class OnlineStockSpan {
     private Stack<int[]>st=new Stack<>();
     
    public OnlineStockSpan() {
        
    }
    
    public int next(int price) {
            
        if(st.size()<1)
        {
            st.add(new int[]{price,1});
            return 1;
        }
        else 
        {
            
            if(st.peek()[0]>price)
            {
                st.add(new int[]{price,1});
                return 1;
            }
            else
            {   
                int counter=1;
                while(st.size()>0||st.peek()[0]<=price)
                {
                    counter+=st.pop()[1];

                }
                st.add(new int []{price,counter});
                return counter;
            }
        }
        
    }
}
