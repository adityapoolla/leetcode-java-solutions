package problems101To200.problem119;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public static List<Integer> getRow(int rowIndex) {
        List<Integer> preIndex = new ArrayList<>();
        preIndex.add(1);
        if(rowIndex == 0)
            return preIndex;
        int temp = 1;
        while(temp <= rowIndex) {
            List<Integer> currentIndex = new ArrayList<>();
            currentIndex.add(1);
            for(int i = 1; i < temp; i++) {
                currentIndex.add(preIndex.get(i-1) + preIndex.get(i));
            }
            currentIndex.add(1);
            preIndex = currentIndex;
            temp++;  
        }
        return preIndex;
    }

    public static void main(String[] args) {
        System.out.println(getRow(3));
    }
}