package domain;

import java.util.Arrays;

public class Exercise {
    public static boolean ifAnagram(String key, String anagram){
        char[] fakeKey = key.toLowerCase().toCharArray();
        char[] fakeAnagram = anagram.toLowerCase().toCharArray();
        Arrays.sort(fakeKey);
        Arrays.sort(fakeAnagram);
        String newKey = new String(fakeKey);
        String newAnagram = new String(fakeAnagram);
        if(newKey.equals(newAnagram))
            return true;
        else return false;
    }
}
