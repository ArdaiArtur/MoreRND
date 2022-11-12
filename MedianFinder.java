import java.util.ArrayList;

class MedianFinder {
 private double counter;
 private double number;
 private ArrayList<Integer> man;
    public MedianFinder() {
        counter=0;
        number=0;
        man=new ArrayList<Integer>();
    }
    
    public void addNum(int num) {
       man.add(num);
       if(man.size()>0 && man.size()%2==0)
       {
        counter++;
        number+=num;
       }
       else
       {
        man.sort(null);
        counter++;
        number+=man.get(man.size()/2);

       }
       if(man.size()>2)

        
    }
    /*
     * 6 
     * 6 10
     * 2 6 10
     * 2 6 6 10
     * 2 5 6 6 10
     * 0 2 5 6 6 10
     * 0 2 5 6 6 6 10
     * 0 2 3 5 6 6 6 10
     * 0 1 2 3 5 6 6 6 10 
     * 0 0 1 2 3 5 6 6 6 10
     * 0 0 0 1 2 3 5 6 6 6 10
     * 
     * 0 1 2 3 4 5  6 7    8 9 10 
     * 6 8 6 6 6 5.5 6 5.5 5 4 3
     */
    public double findMedian() {
        if(man.size()%2==0)
        return number/counter;
        else
        {
           System.out.println(number+" "+counter+" "+num);
           System.out.println(man.get(man.size()/2));
        return (double)man.get(man.size()/2);
        }
    }
}
