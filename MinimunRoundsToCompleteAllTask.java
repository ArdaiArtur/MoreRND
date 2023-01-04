import java.util.HashMap;

public class MinimunRoundsToCompleteAllTask {
    public int minimumRounds(int[] tasks) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        for (int i : tasks) {
            hm.put(i, hm.getOrDefault(i, 0)+1);
        }
        int round=0;
        for (int i : hm.keySet()) {
            System.out.println(i+" "+hm.get(i)); 
        }
        for (int i : hm.values()) {
            //5 2/ 3
            if(i==1) return -1;
            round+=i/3;
            if(i%3!=0)
            {
                round++;
            } 
        }

        return round;

    }
}
