class Solution {
    public boolean checkInclusion(String s1, String s2) {
        char[] ss1 = s1.toCharArray();
        Arrays.sort(ss1);
        String Ss1 = new String(ss1);

        for(int i = 0; i < s2.length(); i++){
            for(int j = i; j < s2.length(); j++){
                char[] subArray = s2.substring(i, j + 1).toCharArray();
                Arrays.sort(subArray);
                String SsA = new String(subArray);

                if(SsA.equals(Ss1)){
                    return true;
                }
            }
        }
        return false;
    }
}
