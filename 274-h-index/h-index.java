class Solution {
    public int hIndex(int[] c) {
        int n=c.length;
        Arrays.sort(c);
        for(int i=0;i<n;i++){
            int h=n-i;
            if(c[i]>=h){
                return h;
            }
        }
        return 0;
    }
}