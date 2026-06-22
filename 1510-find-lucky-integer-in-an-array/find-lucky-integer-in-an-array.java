class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
        
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
           }
        
        int lucky=-1;
        for(int key:map.keySet()){
            if(key==map.get(key))
            lucky=Math.max(lucky,key);

        }
        return lucky;
    }
}