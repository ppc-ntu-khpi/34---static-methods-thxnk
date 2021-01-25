package domain;

import java.util.Arrays;

public class Exercise {
    public static boolean ifAnagram(String key, String anagram){
        char[] charKey = key.toLowerCase().toCharArray();
        char[] charAnagram = anagram.toLowerCase().toCharArray();
        Arrays.sort(charKey);
        Arrays.sort(charAnagram);
        String newKey = new String(charKey);
        String newAnagram = new String(charAnagram);
        if(newKey.equals(newAnagram))
            return true;
        else return false;
    }
}
