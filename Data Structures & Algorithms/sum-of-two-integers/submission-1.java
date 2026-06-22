class Solution {
    public int getSum(int a, int b) {
        int carry = 0;
        int res = 0;
        int mask = 0xFFFFFFFF;

        for(int i = 0; i  < 32; i++){
            int bit_a = (a >> i) & 1;
            int bit_b = (b >> i) & 1;
            int bit_current = bit_a ^ bit_b ^ carry;
            carry = (bit_a + bit_b + carry) >= 2 ? 1 : 0;
            if( bit_current != 0 ){
                res |= (1 << i);
            }
        }

        if(res > 0x7FFFFFFF){
            res = ~(res ^ mask);
        }

        return res;
    }
}
