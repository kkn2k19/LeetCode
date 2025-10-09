// 09.10.2025
// https://leetcode.com/problems/find-the-minimum-amount-of-time-to-brew-potions/?envType=daily-question&envId=2025-10-09
// 3494. Find the Minimum Amount of Time to Brew Potions

public class M_3494_FindTheMinimumAmountOfTimeToBrewPotions {
    // /*
    // public static long minTime(int[] skill, int[] mana) {
    // // Arrays.sort(skill);
    // // Arrays.sort(mana); // since we need to brew in order so sorting not needed

    // int n = skill.length;
    // int m = mana.length;
    // long[][] time = new long[n][m];

    // // first wizard (row 0)
    // time[0][0] = (long) skill[0] * mana[0];
    // for (int j = 1; j < m; j++) {
    // time[0][j] = time[0][j - 1] + (long) skill[0] * mana[j];
    // }

    // // rest of the wizards
    // for (int i = 1; i < n; i++) {
    // time[i][0] = time[i - 1][0] + (long) skill[i] * mana[0];
    // for (int j = 1; j < m; j++) {
    // time[i][j] = Math.max(time[i - 1][j], time[i][j - 1]) + (long) skill[i] *
    // mana[j];
    // }
    // }

    // return time[n - 1][m - 1];
    // } */

    public static long minTime(int[] skill, int[] mana) {
        int n = skill.length;
        int m = mana.length;
        long sumSkill = 0;
        for (int s : skill)
            sumSkill += s;

        long prevWizardDone = sumSkill * (long) mana[0]; // finish time of last wizard for potion 0

        for (int j = 1; j < m; ++j) {
            long prevPotionDone = prevWizardDone;
            // scan wizards from second-last down to first to compute how early we can start
            // potion j
            for (int i = n - 2; i >= 0; --i) {
                // prevPotionDone becomes finish time of wizard i for previous potion (j-1)
                prevPotionDone -= (long) skill[i + 1] * mana[j - 1];

                // ensure wizard i is free when potion j must arrive and that next-wizard
                // constraints hold
                prevWizardDone = Math.max(prevPotionDone, prevWizardDone - (long) skill[i] * mana[j]);
            }
            // add full pipeline time of potion j (sumSkill * mana[j]) to get finish time of
            // last wizard
            prevWizardDone += sumSkill * (long) mana[j];
        }

        return prevWizardDone;
    }

    public static void main(String[] args) {
        int[] skill1 = { 1, 5, 2, 4 };
        int[] mana1 = { 5, 1, 4, 2 };
        System.out.println(minTime(skill1, mana1));

        int[] skill2 = { 1, 1, 1 };
        int[] mana2 = { 1, 1, 1 };
        System.out.println(minTime(skill2, mana2));

        int[] skill3 = { 1, 2, 3, 4 };
        int[] mana3 = { 1, 2 };
        System.out.println(minTime(skill3, mana3));
    }
}