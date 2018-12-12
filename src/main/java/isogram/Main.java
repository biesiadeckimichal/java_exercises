package isogram;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        System.out.println(checkIfisogram("abcdEe"));

    }

    public static boolean checkIfisogram(String word) {
        // lancuchy znakow sa niemutowalne co oznacza ze nie mozna zmienic lancucha
        // znakow samego w sobie, mozna go tylko zmienic i przypisac
        // do nowej zmiennej
        // np word.toLowerCase() zamienia word na male znaki...i nic wiecej nie
        // robi po prostu o nim zapomina
        // pozostalo dodac wyjatek znakow specjalnych
        // array listy sa stale amortyzotwane, czasem moze byc o od n bo
        // array listy moga sie powiekszyc
        word = word.toLowerCase();
        Set<Character> seen = new HashSet<>();

        boolean ifIsogram;
        for (int i = 0; i < word.length(); i++) {
            if (!seen.contains(word.charAt(i))) {
                seen.add(word.charAt(i));
            } else {
                return false;
            }
        }
        return true;
    }
}
