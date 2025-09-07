class Solution {
    public boolean judgeCircle(String moves) {
        // 2D-plane -> U - y++ || D - y-- || L - x-- || R - x++
        int x = 0; // x axis
        int y = 0; // y axis

        for (char ch : moves.toCharArray()) {
            if (ch == 'U')
                y += 1;
            else if (ch == 'D')
                y -= 1;
            else if (ch == 'L')
                x -= 1;
            else if (ch == 'R')
                x += 1;
        }

        if (x == 0 && y == 0)
            return true;
        return false;
    }
}