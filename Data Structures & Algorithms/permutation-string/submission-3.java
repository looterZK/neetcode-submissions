class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()){
            return false;
        }

        int[] s1C = new int[26];
        int[] s2C = new int[26];
        for(int i = 0; i < s1.length(); i++){
            s1C[s1.charAt(i)  - 'a']++;
            s2C[s2.charAt(i)  - 'a']++;
        }

        int matches = 0;
        for(int i = 0; i < 26; i++){
            if(s1C[i] == s2C[i]){
                matches++;
            }
        }

        int l = 0;
        for (int r = s1.length(); r < s2.length(); r++) {
            if (matches == 26) {
                return true;
            }

            int index = s2.charAt(r) - 'a';
            s2C[index]++;
            if (s1C[index] == s2C[index]) {
                matches++;
            } else if (s1C[index] + 1 == s2C[index]) {
                matches--;
            }

            index = s2.charAt(l) - 'a';
            s2C[index]--;
            if (s1C[index] == s2C[index]) {
                matches++;
            } else if (s1C[index] - 1 == s2C[index]) {
                matches--;
            }
            l++;
        }
        return matches == 26;
    }
}
