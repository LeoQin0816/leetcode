/*
 * @lc app=leetcode id=824 lang=java
 *
 * [824] Goat Latin
 *
 * https://leetcode.com/problems/goat-latin/description/
 *
 * algorithms
 * Easy (57.63%)
 * Likes:    144
 * Dislikes: 396
 * Total Accepted:    31.1K
 * Total Submissions: 54K
 * Testcase Example:  '"I speak Goat Latin"'
 *
 * A sentence S is given, composed of words separated by spaces. Each word
 * consists of lowercase and uppercase letters only.
 * 
 * We would like to convert the sentence to "Goat Latin" (a made-up language
 * similar to Pig Latin.)
 * 
 * The rules of Goat Latin are as follows:
 * 
 * 
 * If a word begins with a vowel (a, e, i, o, or u), append "ma" to the end of
 * the word.
 * For example, the word 'apple' becomes 'applema'.
 * 
 * If a word begins with a consonant (i.e. not a vowel), remove the first
 * letter and append it to the end, then add "ma".
 * For example, the word "goat" becomes "oatgma".
 * 
 * Add one letter 'a' to the end of each word per its word index in the
 * sentence, starting with 1.
 * For example, the first word gets "a" added to the end, the second word gets
 * "aa" added to the end and so on.
 * 
 * 
 * Return the final sentence representing the conversion from S to Goat
 * Latin. 
 * 
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: "I speak Goat Latin"
 * Output: "Imaa peaksmaaa oatGmaaaa atinLmaaaaa"
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: "The quick brown fox jumped over the lazy dog"
 * Output: "heTmaa uickqmaaa rownbmaaaa oxfmaaaaa umpedjmaaaaaa overmaaaaaaa
 * hetmaaaaaaaa azylmaaaaaaaaa ogdmaaaaaaaaaa"
 * 
 * 
 * 
 * 
 * Notes:
 * 
 * 
 * S contains only uppercase, lowercase and spaces. Exactly one space between
 * each word.
 * 1 <= S.length <= 150.
 * 
 * 
 */
package BestJava;

import java.util.Arrays;
import java.util.HashSet;

class Solution824 {
    private static final Character[] vowelsList = new Character[]{'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
    private static final HashSet<Character> vowels = new HashSet<Character>(Arrays.asList(vowelsList));

    public String toGoatLatin(String S) {
        if (S == null || S.length() == 0) {
            return "";
        }
        StringBuilder answer = new StringBuilder();
        int wordIndex = 1;

        for (String word : S.split(" ")) {
            if (wordIndex != 1) {
                answer.append(" ");
            }
            char firstCharacter = word.charAt(0);
            if (vowels.contains(firstCharacter)) {
                answer.append(word);
            } else {
                answer.append(word.substring(1));
                answer.append(firstCharacter);
            }
            answer.append("ma");
            for (int i = 0; i < wordIndex; i++) {
                answer.append("a");
            }
            wordIndex++;
        }

        return answer.toString();
    }

    public static void main(String[] args) {
        System.out.println(new Solution824().toGoatLatin("The quick brown fox jumped over the lazy dog"));
    }
}
