package Bit_Manipultion;

public class ithBitOfNumber {
    public static void main(String[] args) {
        int num = 19;
        int ele = 4;
        int res = find(num, ele);
        System.out.println(res);
    }

    static int find(int num, int ele){
        int mask = ele << (ele - 1);
        int digit = num & mask;
        // will give bit at the location
        if (digit != 0){
            return 1;
        }else{
            return digit;
        }
    }
}
