class Solution {
    public String longestCommonPrefix(String[] strs) {
        // the prefix is the entire string[0]
        String prefix = strs[0];

        //go through every string
        for(int i = 1; i < strs.length; i++){
            int j = 0;

            // as soon as the string does match, it means the prefix is different
            while(j < Math.min(prefix.length(), strs[i].length())){
                if(prefix.charAt(j) != strs[i].charAt(j)){
                    break;
                }
                j++;
            }
            prefix = prefix.substring(0, j);
        }
        return prefix;
    }
}