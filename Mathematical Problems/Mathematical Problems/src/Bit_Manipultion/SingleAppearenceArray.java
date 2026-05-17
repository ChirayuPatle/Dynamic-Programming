package Bit_Manipultion;

public class SingleAppearenceArray {
    public static void main(String[] args) {
        int[] arr= {1,3,2,4,3,2,4,1,5};
        int res = findElement(arr);
        System.out.println(res);
    }

    static int findElement(int[] arr){
        int unique = 0;

        for(int n: arr){
            unique ^= n;
        }

        return unique;
    }
}
