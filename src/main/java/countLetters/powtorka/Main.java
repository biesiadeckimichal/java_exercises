package countLetters.powtorka;

import java.nio.file.Path;
import java.util.HashMap;

// Zlicza znaki w słowie i zwraca mapę odwzorowującą znak na ilość wystąpień
// z pominięciem powtórzeń

public class Main {
    public static void main(String[] args) {
        System.out.println(countLetters1("mamatm"));
    }

    public static HashMap countLetters1(String text) {
        HashMap<Character, Integer> myMap = new HashMap<>();
        text = text.toLowerCase();
        for (int i = 0; i < text.length(); i++) {
            char character = text.charAt(i);
            Integer value = myMap.get(character);
            if (value != null) {
                myMap.put(character, value + 1);
            } else {
                myMap.put(character, 1);
            }
        }
        return myMap;
    }
}
