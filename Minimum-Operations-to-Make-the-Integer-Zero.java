class Solution {
    public int makeTheIntegerZero(int num1, int num2) {
        for (int i = 1; i <= 60; i++){
            long diff = (long) num1 - (long)i * num2;
            if (diff < 0) continue;

            int onebits = count1Bits(diff);
            if (onebits <= i && i <= diff) return i;
        }
        return -1;
    }

    public int count1Bits(long n){
        int count = 0;
        while (n > 0){
            if ((n & 1) == 1) count+=1;
            n = n>>1;
        }
        return count;
    }
}