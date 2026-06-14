public class implementStrStr{
    public int strStr(String haystack, String needle) {
        if(needle.length()==0) return 0;
        int i=0;
        while(i<= haystack.length() - needle.length() ){
            int j=0;
            while(j<needle.length()&& haystack.charAt(i+j)== needle.charAt(j)) j++;
            if(j== needle.length()) return i;
            i++;
        }
        return -1;
    }
    public static void main(String[] args) {
        implementStrStr obj = new implementStrStr();
        String haystack = "hello";
        String needle = "ll";
        int result = obj.strStr(haystack, needle);
        System.out.println(result); // Output: 2
    }
}