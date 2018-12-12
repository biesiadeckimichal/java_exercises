package chessboard;

// Wyobraźmy sobie pewną nieskończoną w dwóch wymiarach planszę prostokątną składająca
// się z kwadratów (nieskończoną siatkę / szachownicę). Z pewnego dowolnego miejsca
// (nie ma znaczenia jakiego) –  pewien gracz zaczyna poruszać pionkiem.
// Może wykonać ruch: w lewo (L), w prawo (P), do góry (G) albo w dół (D).
// Napisz optymalny algorytm w postaci funkcji, która jako argument przyjmuje
// napis składający się jedynie z symboli ze zbioru {L, P, G, D}.
// Funkcja powinna zwrócić wartość true jeśli ciąg liter opisuje zamkniętą ścieżkę
// – to znaczy ścieżkę która powraca do pola z którego wystartował pionek albo false
// – w przeciwnym wypadku. Na przykład dla napisu „PPDDLGGL” funkcja powinna zwrócić true
// natomiast dla napisu: „DDPPG” funkcja powinna zwrócić false (bo ścieżka nie tworzy cyklu)
// Podpowiedź: rozwiązanie  jest bardzo proste, w rozwiązaniu nie jest potrzebne użycie tablicy.

// W optymalnym rozwiązaniu chodziło właśnie o coś takiego. Najważniejsze - czyli złożoność
// czasową masz dobrą, czyli O(n) ale kod można mocno zoptymalizować
// poza drobiazgiem czyli że nie wszystkie nazwy zmiennych masz z małej litery
// w javie jest taka konwencja) jest inny problem popatrz - załóżmy że natrafisz na
// L - wtedy niepotrzebnie dalej sprawdzasz w danej iteracji czy jest P albo G albo D
// - skoro jest L to nie ma sensu wykonywac pozostalem porownania inna sprawa
// - mniej powazna - to sie da zrobic z uzyciem tylko dwoch zmiennych licznikowych
// a nie czterech

public class Main {
    public static void main(String[] args) {
        System.out.println(move("PPLLDG"));
    }

    // public static boolean move(String text) {
    //     int lCounter = 0;
    //     int pCounter = 0;
    //     int gCounter = 0;
    //     int dCounter = 0;
    //     boolean result = true;
    //
    //     for (int i = 0; i < text.length(); i++) {
    //         if (text.charAt(i) == 'L') {
    //             lCounter++;
    //         }
    //         else if (text.charAt(i) == 'P') {
    //             pCounter++;
    //         }
    //         else if (text.charAt(i) == 'G') {
    //             gCounter++;
    //         }
    //         else if (text.charAt(i) == 'D') {
    //             dCounter++;
    //         }
    //     }
    //
    //     if (lCounter != pCounter || gCounter != dCounter) {
    //         result = false;
    //     }
    //
    //     return result;
    // }

    public static boolean move(String text) {
        int xCounter = 0;
        int yCounter = 0;
        boolean result = true;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == 'P') {
                xCounter++;
            }
            else if (text.charAt(i) == 'L') {
                xCounter--;
            }
            else if (text.charAt(i) == 'G') {
                yCounter++;
            }
            else if (text.charAt(i) == 'D') {
                yCounter--;
            }
        }

        if (xCounter != 0 || yCounter != 0) {
            result = false;
        }

        return result;
    }
}
