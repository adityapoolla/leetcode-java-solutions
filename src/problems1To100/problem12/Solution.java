package problems1To100.problem12;

class Solution {
    public static String intToRoman(int num) {
        int thousands = num / 1000;
        num = num - thousands * 1000;
        int hundreds = num / 100;
        num = num - hundreds * 100;
        int tens = num /10;
        num = num - tens * 10;
        int ones = num;
        
        String roman = "";
        while(thousands > 0) {
            roman += 'M';
            thousands--;
        }

        roman = roman + addRoman(hundreds, "M", "D", "C")
            + addRoman(tens, "C", "L", "X")
            + addRoman(ones, "X", "V", "I");
        return roman;
    }
    
    public static String addRoman(int count, String h, String l, String ins) {
        String roman = "";
        if(count == 5) {
            roman += l;
        }
        else if(count == 4) {
            roman += ins + l;
        } else if(count == 9) {
            roman += ins + h;
        } else if(count < 5) {
            while(count > 0) {
                roman += ins;
                count--;
            }
        } else {
            roman += l;
            count -= 5;
            while(count > 0) {
                roman += ins;
                count--;
            }
        }
        return roman;
    }

    public static void main(String[] args) {
        System.out.println(1994/1000);
        System.out.println(intToRoman(1994));
    }
    
}