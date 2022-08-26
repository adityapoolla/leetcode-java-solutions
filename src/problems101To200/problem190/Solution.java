package problems101To200.problem190;

public class Solution {
    // you need treat n as an unsigned value
    public static int reverseBits(int n) {
        String binStr = Integer.toBinaryString(n);
        StringBuilder sb = new StringBuilder();
        sb.append(binStr);
        binStr = sb.reverse().toString();
        return Integer.parseInt(binStr, 2);
    }

    public static void main(String[] args) {
        reverseBits(Integer.parseInt("00000010100101000001111010011100", 2));
    }
}