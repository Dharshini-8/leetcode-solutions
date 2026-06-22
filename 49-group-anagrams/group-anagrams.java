class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //test
        HashMap<String,List<String>> map=new HashMap<>();
        for(int i=0;i<strs.length;i++){
            String w=strs[i];
            char a[]=w.toCharArray();
            Arrays.sort(a);
            String b=new String(a);
            if(!map.containsKey(b)){
            map.put(b,new ArrayList<>());
        }
        map.get(b).add(w);
    }
    return new ArrayList<>(map.values());
}
}