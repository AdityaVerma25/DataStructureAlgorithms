package ArrayProblem_BinarySearch;

import java.util.Arrays;

public class DividePlayersIntoTeams {
    public static long dividePlayers(int[] skill) {
        Arrays.sort(skill);
        int sum = skill[0] + skill[skill.length - 1];
        int sumOfChemistry = skill[0] * skill[skill.length - 1];
        for (int i = 1; i < skill.length / 2; i++) {
            int pairIndex = skill.length - 1 - i;
            if (skill[i] + skill[pairIndex] != sum)
                return -1;
            int chemistry = skill[i] * skill[pairIndex];
            sumOfChemistry += chemistry;
        }
        return sumOfChemistry;
    }

    public static void main(String[] args) {
        int[] skill = { 3, 2, 5, 1, 3, 4 };
        System.out.println(dividePlayers(skill));
    }

}
