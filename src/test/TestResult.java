package test;

import domain.Exercise;
import java.util.Scanner;

public class TestResult {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("A key word");
        String key = sc.nextLine();
        System.out.println("An anagram");
        String anagram = sc.nextLine();
        System.out.println("The result is: "+ Exercise.ifAnagram(key,anagram));
    }
}
