package problems1To100.problem43;



public class Solution {
	
	public static void main(String[] args) {
		Solution soln = new Solution();
//		System.out.println(soln.multiplyByANumber("999", '9'));
//		System.out.println(999 * 9);
//		
//		System.out.println(soln.zeros(1));
		
		System.out.println(soln.multiply("2", "3"));
		
	}
    public String multiply(String num1, String num2) {
        String result = "";
        for(int i = num2.length() - 1; i >= 0; i--) {
        	String res1 = multiplyByANumber(num1, num2.charAt(i));
        	String zer = zeros(num2.length() - 1 - i);
        	System.out.println(res1);
        	System.out.println(zer);
            result = addTwoStrings(result, res1 + zer);
        }

        return result;
    }

    private String addTwoStrings(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        int i = a.length() - 1;
        int j = b.length() - 1;
        while(i >= 0 && j >= 0) {
            Integer aa = Integer.parseInt(a.charAt(i) + "");
            Integer bb = Integer.parseInt(b.charAt(j) + "");
            int result = aa + bb + carry;
            carry = 0;
            sb.append(result % 10 + "");
            carry = result / 10;
            i--;
            j--;
        }
        while(i >= 0) {
            Integer aa = Integer.parseInt(a.charAt(i) + "");
            int result = aa + carry;
            carry = 0;
            sb.append(result % 10 + "");
            carry = result / 10;
            i--;
        }

        while(j >= 0) {
            Integer bb = Integer.parseInt(b.charAt(j) + "");
            int result = bb + carry;
            carry = 0;
            sb.append(result % 10 + "");
            carry = result / 10;
            j--;
        }
        
        if(carry > 0) {
            sb.append(carry + "");
        }
        
        return sb.reverse().toString();
    }

    private String zeros(int i) {
        StringBuilder sb = new StringBuilder();
        while(i > 0) {
            sb.append("0");
            i--;
        }
        return sb.toString();
    }

    private String multiplyByANumber(String num, char i) {
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        for(int j = num.length() - 1; j >= 0; j--) {
            int result = (Integer.parseInt(i + "") * Integer.parseInt(num.charAt(j) + "")) + carry;
            carry = 0;
            sb.append(result % 10);
            carry = result / 10;
        }
        if(carry > 0) {
            sb.append(carry + "");
        }
        return sb.reverse().toString();
    }
}