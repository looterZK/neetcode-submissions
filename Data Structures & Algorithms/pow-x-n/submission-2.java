public class Solution {
    public double myPow(double x, int n) {
        if(x == 0){
            return 0;
        }
        if(n == 0){
            return 1;
        }

        double r = 1;
        for(int i = 0; i < Math.abs(n); i++){
            r *= x;
        }
        return n >= 0 ? r : 1 / r;
    }
}