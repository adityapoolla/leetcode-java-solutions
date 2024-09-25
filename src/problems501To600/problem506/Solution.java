package problems501To600.problem506;
class Solution {
    public String[] findRelativeRanks(int[] score) {
        int[] positions = new int[score.length];
        for(int i = 0; i < positions.length; i++) positions[i] = i;
        sort(score, positions, 0, positions.length - 1);
        String[] ranks = new String[score.length];
        for(int i = 0; i < positions.length; i++) {
            int rank = i + 1;
            ranks[positions[i]] = switch(rank) {
                case 1 -> "Gold Medal";
                case 2 -> "Silver Medal";
                case 3 -> "Bronze Medal";
                default -> rank + "";
            };
        }
        return ranks;
    }

    private void sort(int[] score, int[] positions, int l, int r) {
        if(l < r) {
            int m = l + (r - l) / 2;
            sort(score, positions, l, m);
            sort(score, positions, m + 1, r);
            merge(score, positions, l, m, r);
        }
    }

    private void merge(int[] score, int[] positions, int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;
        int[] L = new int[n1];
        int[] R = new int[n2];
        int[] LP = new int[n1];
        int[] RP = new int[n2];
        for(int i = 0; i < n1; i++) {
            L[i] = score[l + i];
            LP[i] = positions[l + i];
        }
        for(int i = 0; i < n2; i++) {
            R[i] = score[m + 1 + i];
            RP[i] = positions[m +i + 1];
        }
        int i = 0; 
        int j = 0;
        int k = l;
        while(i < n1 && j < n2) {
            if(L[i] < R[j]) {
                score[k] = R[j];
                positions[k] = RP[j];
                k++;
                j++;
            } else {
                score[k] = L[i];
                positions[k] = LP[i];
                k++;
                i++;
            }
        }
        while(i < n1) {
            score[k] = L[i];
            positions[k] = LP[i];
            k++;
            i++;
        } 
        while(j < n2) {
            score[k] = R[j];
            positions[k] = RP[j];
            j++;
            k++;
        }
    }
}