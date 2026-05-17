package Bit_Manipultion;

public class ResetBit {
    public static void main(String[] args) {
            int num = 19;
            int ele = 4;
            int res = find(num, ele);
            System.out.println(res);
        }
    static int find(int num, int ele) {
         return num & ~(ele << (ele -1));

//        int mask = ele << (ele - 1);
//        int complement = ~mask;
//        int digit = num & complement;
//        return digit;

    }
}
