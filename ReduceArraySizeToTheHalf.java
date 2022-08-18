import java.util.Arrays;

public class ReduceArraySizeToTheHalf {
    public int minSetSize(int[] arr) {
        int length=arr.length;
        int []count=new int [9999];
        for (int i : arr) {
            count[i]++;
        }
        Arrays.sort(count);
        int fin=0;
        for (int i = count.length-1; i>0; i--) {
            fin++; 
             length-=count[i];
            if(length<=arr.length/2)
            {
                return fin;
            }
           
           
        }
        return fin;
    }
}
