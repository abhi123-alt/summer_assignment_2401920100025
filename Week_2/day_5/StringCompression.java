public class StringCompression{
    public int compress(char[] chars) {
        int n=chars.length;
        int left=0,i=0;
        while(i<n){
            char current= chars[i];
            int count=0;
            // counting the consecutive elements;
            while(i<n && chars[i]==current){
                i++;
                count++;
            }
            chars[left++]=current;
            if(count>1){
                String cnt= String.valueOf(count);
                for(char c: cnt.toCharArray()){
                    chars[left++]=c;
                }
            }
        }
        return left;
    }
    public static void main(String[] args) {
        StringCompression sc = new StringCompression();
        char[] chars = {'a','a','b','b','c','c','c'};
        int newLength = sc.compress(chars);
        System.out.println("Compressed Length: " + newLength);
        System.out.print("Compressed Array: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(chars[i]);
        }
    }
}