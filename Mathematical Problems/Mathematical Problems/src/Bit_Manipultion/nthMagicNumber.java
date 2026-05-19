package Bit_Manipultion;

public class nthMagicNumber {
    public static void main(String[] args) {
        int res = magicNumber(3);
        System.out.println(res);
    }

    static int magicNumber(int n){
        int ans = 0;
        int base = 5;
        while(n > 0){
            int last = n & 1; // last digit
            n = n >> 1; // move ahead for last digit

            ans += last * base;
            base = base * 5; // power of 5
        }

        return ans;
    }
}
