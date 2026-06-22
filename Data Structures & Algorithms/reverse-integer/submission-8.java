class Solution {
    public int reverse(int x) {
        if (x == Integer.MIN_VALUE) return 0;
        int original = x;
        x = Math.abs(x);
        long result = Long.parseLong(new StringBuilder(
                   String.valueOf(x)).reverse().toString()
                );
        if(original < 0){
            result = result * -1;
        }
        if(result < Integer.MIN_VALUE || result > Integer.MAX_VALUE){
            return 0;
        }
        return (int)result;
    }
}