public class repeatedSubstring{
    public boolean repeatedSubstringPattern(String s) {
        String doubled = s + s;
        // Remove first and last character to avoid trivial match
        return doubled.substring(1, doubled.length() - 1).contains(s);
    }
    public static void main(String []args){
        repeatedSubstring sol= new repeatedSubstring();
        System.out.println(sol.repeatedSubstringPattern("abababab"));
        System.out.println(sol.repeatedSubstringPattern("abac"));
    }
}