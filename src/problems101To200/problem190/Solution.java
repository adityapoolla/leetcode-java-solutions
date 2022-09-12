package problems101To200.problem190;

public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        String binary = Integer.toBinaryString(n);
        int lendiff = 32 - binary.length();
        String zeros = "";
        while(lendiff > 0) {
            zeros += "0";
            lendiff--;
        }
        binary = zeros + binary;
        StringBuilder input1 = new StringBuilder();
        input1.append(binary);
        input1.reverse();
        String rev = input1.toString();
        return Integer.parseInt(rev,2);
    }

    public static void main(String[] args) {

        System.out.println(Integer.toBinaryString( -6));
        System.out.println(Integer.toBinaryString(6));
        System.out.println(Integer.parseInt("1111111111111111111111111111010", 2));
    }
};