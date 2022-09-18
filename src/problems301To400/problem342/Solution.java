package problems301To400.problem342;

class Solution {
    public boolean isPowerOfFour(int n) {
        if(n == 0)
            return false;
        while(n % 4 == 0)
            n = n/4;
        return n == 1;
    }

    public boolean isPowerOfFour2(int num) {
        return num > 0 && (num&(num-1)) == 0 && (num & 0x55555555) != 0;
        //0x55555555 is to get rid of those power of 2 but not power of 4
        //so that the single 1 bit always appears at the odd position
    }

//    Good solution without good explanation,it's easy to find that power of 4 numbers have those 3 common features.First,greater than 0.Second,only have one '1' bit in their binary notation,so we use x&(x-1) to delete the lowest '1',and if then it becomes 0,it prove that there is only one '1' bit.Third,the only '1' bit should be locate at the odd location,for example,16.It's binary is 00010000.So we can use '0x55555555' to check if the '1' bit is in the right place.With this thought we can code it out easily!
    // Good answer, 0x55555555 is a hexametrical number，it is 1010101010101010101010101010101 in binary with a length of 32. To make sure the 1 locates in the odd location.
}

