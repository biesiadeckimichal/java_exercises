package sameIndexAndCell;

// Napisz optymalny algorytn funkcję której argumentem jest posortowana nie malejąco tablica liczb całkowitych.
// Funkcja powinna zwrócić indeks elementu który jest równy wartości w komórce o tym indeksie,
// albo -1 gdy takiego elementu nie ma.
// Na przykład dla tablicy:
// [-1,1,3,6,9,9]
// funkcja powinna zwrócić 1

public class Main {
    public static int checkSimilarity(int []array) {
        int start = 0;
        int end = array.length - 1;

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == i) {
                return 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 2, 5, 6};
        System.out.println(checkSimilarity(array));
    }

}
