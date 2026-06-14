public class compressarray{
    public int compress(char[] chars) {
        int n= chars.length;
        if(n==1) return 1;
        int []seen= new int[256];
        int count=0;
        for(int i=0;i<n;i++){
            int temp= chars[i];
            seen[temp]++;
        }
        for(int i=0;i<256;i++){
            if(seen[i]!=0){
                int r=0;
                while(seen[i]>0){
                    r++;
                    seen[i]/=10;
                }
                count=count+r+1;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        compressarray obj= new compressarray();
        char []chars= {'a','a','b','b','c','c','c'};
        char []chars2= {'a','a','b','b','b','b','b','b','b','b','b','b','b','b','b','b','b','b','b'};
        System.out.println(obj.compress(chars));
        System.out.println(obj.compress(chars2));
    }
}