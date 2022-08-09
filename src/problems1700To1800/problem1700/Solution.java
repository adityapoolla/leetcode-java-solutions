package problems1700To1800.problem1700;

import java.util.*;

class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue ones = new PriorityQueue();
        Queue zeros = new PriorityQueue();
        int i = 0, j = 0;
        while(i < students.length) {
            if(students[i] == -1)
                i++;
            if(students[i] == sandwiches[j]) {
                students[i] = -1;
                i++;
                j++;
            } else {
                if(students[i] == 0)
                    zeros.add(i);
                else
                    ones.add(i);
                i++;
            }
        }

        if(j == sandwiches.length)
            return 0;

        while(j < sandwiches.length && (zeros.peek() != null || ones.peek() != null)) {
            if(sandwiches[j] == 0){
                if(zeros.peek() != null) {
                    zeros.poll();
                    j++;
                } else {
                    break;
                }
            } else if(sandwiches[j] == 1) {
                if(ones.peek() != null) {
                    ones.poll();
                    j++;
                } else {
                    break;
                }
            }
        }
        return sandwiches.length - j;
    }
}