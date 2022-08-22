import java.util.Arrays;

import java.util.Collections;
import java.util.HashMap;
import java.util.PriorityQueue;

public class ReduceArraySizeToTheHalf {
    public int minSetSize(int[] arr) {
        int length=arr.length;
        int []count=new int [100001];
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

    public int minSetSizeefi(int[] arr) {
    HashMap<Integer,Integer>hm=new HashMap<>();
   int n=arr.length;
    for (int i =0;i<n;i++) {
       hm.put(arr[i], hm.getOrDefault(arr[i], 0)+1);
    }
   
   PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
     for (var i : hm.entrySet()) {
        pq.add(i.getValue());
    }
    int res=0;
    int count=0;
    while(res<n/2 && pq.size()>0)
    {
        count++;
        res+=pq.remove();
    }
    return count;
    }
}
