package generics;

import java.util.LinkedList;

public class TestGenerics {

    // samo T wskazuje na najogolniejszy typ czyli po prostu Object(),
    // ktory implementuje nam rozne metody np. sout, czy roznej inne (nacisnij z ctrl)
    // jesli chcemy miec dodatkowe metody musimy to T poszerzyc o dany interface
    // <T> powoduje ze mozemy wprowadzic dowolny argument (dana wejsciowa)
    // T za <T> mowi ze otrzymamy dowolny wynik String, Integer itp
    // Comparable, Comparable<T> roznica jest taka ze pierwszy przypadek
    // mowi ze mozemy porownac obiekt jakiegokolwiek typu, drugi ze mozemy porownywac
    // tylko obiekty tego samego typu np klasa czlowiek/nazwisko tylko z klasa czlowiek/nazw
    // a nie czl/nazw do Stringa nazwisko
    // compareTo dziala tak ze zwraca <0 / 0 / 0<:
    // x = y -> 0
    // x < y -> <0
    // x > y -> >0
    public static <T extends Comparable<T>> T foo(T arg) {
        System.out.println(arg);
        arg.compareTo(arg);
        return arg;
    }

    public static void main (String[] args) {
        foo("test");
        foo(2);
        String s = foo("test");
        Integer n = foo(2);
    }
}
