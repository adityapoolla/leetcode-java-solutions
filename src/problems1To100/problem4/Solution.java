package problems1To100.problem4;

public class Solution {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int[] mergedArray = new int[n1 + n2];
        int i = 0;
        int j = 0;
        int k = 0;
        while(i < n1 && j < n2) {
            if(nums1[i] <= nums2[j]) {
                mergedArray[k] = nums1[i];
                i++;
                k++;
            } else {
                mergedArray[k] = nums2[j];
                j++;
                k++;
            }
        }
        while(i < n1) {
            mergedArray[k] = nums1[i];
            i++;
            k++;
        }
        while(j < n2) {
            mergedArray[k] = nums2[j];
            j++;
            k++;
        }
        System.out.println((n1 + n2) %2);
        if((n1 + n2) %2 == 0) {
            int low = ((n1 + n2) /2) - 1;
            int high = (n1 + n2) /2;
            System.out.println(((double)mergedArray[low] + (double)mergedArray[high]) / 2);
            return ((double)mergedArray[low] + (double)mergedArray[high]) / 2;
            
        } else {
            int key = (n1 + n2) / 2;
            return mergedArray[key];
        }
    }

    public static void main(String[] args) {
        findMedianSortedArrays(new int[]{1,2}, new int[]{3, 4});
    }
}