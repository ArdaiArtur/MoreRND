import java.util.HashSet;

public class SumSquerNumbers {
    public boolean judgeSquareSum(int c) {
        HashSet<Integer>hs=new HashSet<>();
        for (int i = 0,j=46341; i < j&&j>i; i++,j--) {
            int a=i*i;
            int b=j*j;
            if(a>c||b<c) break;
            hs.add(a);
            hs.add(b);
            if(hs.contains(c-a)||hs.contains(c-b))
            return true;
        }
        return false;
    }
}
