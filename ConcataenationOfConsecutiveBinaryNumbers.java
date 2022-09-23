public class ConcataenationOfConsecutiveBinaryNumbers {
    public static void main(String[] args) {
        concatenatedBinary(3);
    }
// so from base 10 to lower basese is basicly \\\total= number %base\\\\ and then  number=number/base
// to upper bases is basicly value =input%outputbase check if is smaller or bigger then 9 if smaller then result +=value(string)
// else result+= (char)(value+55) ;ascii code of it  
    public static int concatenatedBinary(int n) {
        final long modulo = (long) (1e9 + 7);
        long result = 0;
        int binaryDigits = 0;
        for (int i = 1; i <= n; i++) {
            if ((i & (i - 1)) == 0) binaryDigits++;
            result = ((result << binaryDigits) + i) % modulo;
            System.out.println(result);
        }
        return (int) result;
    }

}
