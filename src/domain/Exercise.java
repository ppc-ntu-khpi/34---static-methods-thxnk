package domain;

import java.util.Arrays;
/**
 * a class that callculates the result
 * @author boss
 */
public class Exercise {
    /**
     * method that callculates the result
     * @param key a main word
     * @param anagram an anagram of key word
     * @return returns a boolean(true - if it is an anagram, false - if not)
     */
    public static boolean ifAnagram(String key, String anagram){
        char[] charKey = key.toLowerCase().toCharArray();
        char[] charAnagram = anagram.toLowerCase().toCharArray();
        Arrays.sort(charKey);
        Arrays.sort(charAnagram);
        String newKey = new String(charKey);
        String newAnagram = new String(charAnagram);
        return newKey.equals(newAnagram);
    }
}
