package Bit_Manipulation;

public class SingleNumber {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,1,2,4,5,5};
        int xor =0;
        for (int i = 0; i < arr.length; i++) {
            xor ^= arr[i];
        }
        System.out.println(xor);
    }
}
