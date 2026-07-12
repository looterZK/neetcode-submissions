class Solution {
    public boolean isHappy(int n) {
        int sl = n;
        int fs = sumOfSquares(n);

        while(sl != fs){
            fs = sumOfSquares(fs);
            fs = sumOfSquares(fs);
            sl = sumOfSquares(sl);
        }

        return fs == 1;
    }

    private int sumOfSquares(int n){
        int out = 0;
        while(n != 0){
            out += (n % 10) * (n % 10);
            n /= 10;
        }
        return out;
    }
}
