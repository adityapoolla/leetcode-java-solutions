package problems101To200.problem171;

class Solution {
    public static int titleToNumber(String columnTitle) {
        int result = 0;
        int len = columnTitle.length();
        for(int i = 0; i < len; i++) {
            int place = len - i - 1;
            char ch = columnTitle.charAt(place);
            int placeValue = (int)Math.pow(26, i);
            int faceValue = ch - 'A' + 1;
            result = result + (placeValue * faceValue);
        }
        return result;
    }

    public static void main(String[] args) {
        int result = titleToNumber("ZY");
        System.out.println(result);
    }
}
