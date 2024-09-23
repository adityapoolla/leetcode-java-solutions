package problems401To500.problem496;
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        for(int i = 0; i < nums1.length; i++) {
            int nextGreaterElem = -1;
            boolean indexFound = false;
            for(int j = 0; j < nums2.length; j++) {
                if(indexFound && nums2[j] > nums1[i]) {
                    nextGreaterElem = nums2[j];
                    break;
                }
                else if(nums1[i] == nums2[j]) {
                    indexFound = true;
                }
            }
            nums1[i] = nextGreaterElem;
        }
        return nums1;
    }
}