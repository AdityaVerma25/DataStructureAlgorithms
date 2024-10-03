//https://leetcode.com/problems/check-if-the-sentence-is-pangram/description/

import java.util.HashSet;
import java.util.Set;

public class PanagramSentence {

    public static boolean isPanagram(String sentence) {
        String newString = sentence.toLowerCase();
        Set<Character> uniqueCharacter = new HashSet<>();
        for (char c : newString.toCharArray()) {
            uniqueCharacter.add(c);
        }
        return uniqueCharacter.size() == 26;
    
    }

    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(isPanagram(sentence));

    }
}
