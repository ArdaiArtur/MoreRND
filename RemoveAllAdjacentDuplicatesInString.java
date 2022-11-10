public class RemoveAllAdjacentDuplicatesInString {
    public String removeDuplicates(String s) {
        int i=1;
        int j=s.length()-1;
        while (i<j) {
             if(i<1)
             i=1;
            if(s.length()>1&& s.charAt(i-1)==s.charAt(i))
            {
                String ss=s.substring(0, i-1)+s.substring(i, j);
                    s=ss;
                    j-=2;
                    i-=2;
            }
            i++;
        }
        return s;
    }


    public String removeDuplicate(String s) {
        int i = 0;
        int len = s.length();

        char arr[] = s.toCharArray();
        for(int j = 0; j<len; j++){
            arr[i] = arr[j];
            if(i>0 && arr[i]==arr[i-1]){
                i -= 2;
            }
            i++;
        }
        return new String(arr, 0, i);

    }
}
