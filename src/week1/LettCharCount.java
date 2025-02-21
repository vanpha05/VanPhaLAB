/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week1;

import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

/**
 *
 * @author LENOVO
 */
public class LettCharCount {

    private String input;

    public LettCharCount(String input) {
        this.input = input;
    }

    Map<String, Integer> countWord() {
        Map<String, Integer> wordCount = new HashMap<>();
        StringTokenizer token = new StringTokenizer(input);
        while (token.hasMoreTokens()) {
            String word = token.nextToken();
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);

        }

        return wordCount;
    }

    Map<Character, Integer> countChar() {
        Map<Character, Integer> countChar = new HashMap<>();
        for (char n : input.toCharArray()) {
            if (Character.isLetter(n)) {
                countChar.put(n, countChar.getOrDefault(n, 0) + 1);
            }
        }
        return countChar;
    }

}
