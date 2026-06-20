class Solution {
    public String longestCommonPrefix(String[] strs) {
        for(int i = 0; i < strs[0].length(); i++){
            for(String x : strs){
                if(i == x.length() ||  x.charAt(i) != strs[0].charAt(i)){
                    return x.substring(0, i);
                }
            }
        }
        return strs[0];
    }
}