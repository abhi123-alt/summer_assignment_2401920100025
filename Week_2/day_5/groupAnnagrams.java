import java.util.*;
public class groupAnnagrams{
     public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> mp= new HashMap<>();
        int n= strs.length;
        for(int i=0;i<n;i++){
         char[] t= strs[i].toCharArray();
         Arrays.sort(t);
         String temp= new String(t);
        if(!mp.containsKey(temp)){
             mp.put(temp,new ArrayList<>());
        }
         mp.get(temp).add(strs[i]);
        }
        ArrayList<List<String>> ans= new ArrayList<>();
        for(String s: mp.keySet()){
            ans.add(mp.get(s));
        }
        return ans;
    }
    public static void main(String[] args) {
        groupAnnagrams ga = new groupAnnagrams();
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> result = ga.groupAnagrams(strs);
        System.out.println(result);
    }
}