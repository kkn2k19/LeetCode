// 10.10.2025
// https://leetcode.com/problems/taking-maximum-energy-from-the-mystic-dungeon/description/
// 3147. Taking Maximum Energy From the Mystic Dungeon

public class M_3147_TakingMaximumEnergyFromTheMysticDungeon {
    public static int maximumEnergy(int[] energy, int k) {
        int n = energy.length;
        int max = Integer.MIN_VALUE;

        for (int i = n - k; i < n; i++) {
            max = Math.max(max, energy[i]);
        }

        for (int i = n - k - 1; i >= 0; i--) {
            energy[i] = energy[i] + energy[i + k];
            max = Math.max(max, energy[i]);
        }

        return max;
    }

    public static void main(String[] args) {
        int[] energy1 = { 5, 2, -10, -5, 1 };
        int k1 = 3;
        System.out.println(maximumEnergy(energy1, k1));

        int[] energy2 = { -2, -3, -1 };
        int k2 = 2;
        System.out.println(maximumEnergy(energy2, k2));
    }
}

// E:\Karan_codes\LeetCode>cd "e:\Karan_codes\LeetCode\" && javac
// M_3147_TakingMaximumEnergyFromTheMysticDungeon.java && java
// M_3147_TakingMaximumEnergyFromTheMysticDungeon && del
// M_3147_TakingMaximumEnergyFromTheMysticDungeon.class
// 3
// -1