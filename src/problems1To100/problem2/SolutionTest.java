package problems1To100.problem2;

public class SolutionTest {

	public static void test() throws Exception {
		Solution solution = new Solution();
		ListNode l1 = new ListNode(9, new ListNode(9));
		ListNode l2 = new ListNode(9, new ListNode(9));
		ListNode result = solution.addTwoNumbers(l1, l2);
		if(result.val != 8 || result.next.val != 9 || result.next.next.val != 1) {
			throw new Exception("Test failed");
		}
	}
	
	public static void main(String[] args) throws Exception {
		test();
		System.out.println("Tests Passed");
	}
}
