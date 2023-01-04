import java.util.Stack;

public class SumOfSubarray {
    public int sumSubarrayMins(int[] arr) {
        int mod=1000000007;
        Stack<Integer> st=new Stack<>();
        long sumofmins=0;
        for (int i = 0; i <= arr.length; i++) {
            while (!st.empty()&&(i==arr.length|| arr[st.peek()]>=arr[i])) {
                int mid=st.pop();
                int leftBoundary=st.empty()?-1:st.peek();
                int rightBoundtay=i;
                long count=(mid-leftBoundary)*(rightBoundtay-mid)%mod;
                sumofmins+=(count*arr[mid])%mod;
                sumofmins%=mod;

            }
            st.push(i);
        }
        System.out.println();
        return (int)(sumofmins);
    }
}
