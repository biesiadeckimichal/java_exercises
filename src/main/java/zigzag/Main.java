package zigzag;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        List<Integer> lst = Arrays.asList(new Integer[] {5, 4, 3, 3, 2, 1});
        Iterator<Integer> iter = lst.iterator();
        Integer x;
        // funkcje hasNext wywolujemy poniewaz iterator w domysle jest poza
        // kolekcja, hasNext powoduje jego uruchomienie, czyli wskakuje do listy
        // mowi czy mozemy isc dalej czyli czy jest kolejny element
        while (iter.hasNext()) {
            // iter.next przechodzi do kolejnego elementu i zwraca jego wartosc
            // to jest dokladnie tosamo foreach, tylko z bebechami na wierzchu
            // czyli np mozemy tu dodac remove.
            x = iter.next();
            if (x > 4) {
                iter.remove();
            }
        }
    }

    public static void makeZigZag(List<Integer> lst) {
        if (lst.size() <= 2) {
            return;
        }

        ListIterator<Integer> itFirst = lst.listIterator();
        ListIterator<Integer> itSecond = lst.listIterator();
        itSecond.next();

        Integer x, y, order = itSecond.next() - itFirst.next();
        if (order == 0) {
            order = 1;
        }

        while (itSecond.hasNext()) {
            x = itSecond.next();
            y = itFirst.next();
            if((x - y) * order > 0) {
                itSecond.set(y);
                itFirst.set(x);
            }
            order = -order;
        }
    }
}
