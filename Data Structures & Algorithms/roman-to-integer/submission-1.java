class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> key = new HashMap<>();
        key.put('I', 1); key.put('V', 5); key.put('X', 10); key.put('L', 50); 
        key.put('C', 100); key.put('D', 500); key.put('M', 1000);  

        int res = 0;

        for(int i = 0; i < s.length(); i++){
            if(i + 1 < s.length() && key.get(s.charAt(i)) < key.get(s.charAt(i+1))){
                res = res - key.get(s.charAt(i));
            }else{
                res = res + key.get(s.charAt(i));
            }
        }
        return res;
    }
}