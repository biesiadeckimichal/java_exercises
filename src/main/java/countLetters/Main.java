package countLetters;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        System.out.println(letterCounter2("alaaawL"));

    }

    public static HashMap letterCounter(String word) {
        Set<Character> seen = new HashSet<>();
        HashMap<Character, Integer> myMap = new HashMap<>();
        word = word.toLowerCase();
        for (int i = 0; i < word.length(); i++) {
            Character character = word.charAt(i);
            int letterCounter = 0;
            if (!seen.contains(character)) {
                for (int j = 0; j < word.length(); j++) {
                    if (word.charAt(j) == character)
                    letterCounter++;
                }
                myMap.put(character, letterCounter);
            }
        }
        return myMap;
    }

    public static HashMap letterCounter2(String word) {
        Set<Character> seen = new HashSet<>();
        HashMap<Character, Integer> myMap = new HashMap<>();
        word = word.toLowerCase();
        for (int i = 0; i < word.length(); i++) {
            Character character = word.charAt(i);
            int letterCounter = 0;
            letterCounter++;
            if (!seen.contains(character)) {
                myMap.put(character, letterCounter);
            }
        }
        return myMap;
    }
}
