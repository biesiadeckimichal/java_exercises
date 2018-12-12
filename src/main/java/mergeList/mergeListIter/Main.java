// package mergeList.mergeListIter;
//
// import java.util.ArrayList;
// import java.util.Iterator;
// import java.util.List;
//
// public class Main {
//     public static List<Integer> merge2(List<Integer> first, List<Integer> second) {
//         Iterator<Integer> itFirst = first.iterator(), itSecond = second.iterator();
//         Integer x, y;
//
//         List<Integer> result = new ArrayList<>(first.size() + second.size());
//
//         x = itFirst.next();
//         y = itSecond.next();
//
//         while (x != null & y != null) {
//             if (x < y) {
//                 result.add(x);
//                 x = itFirst.hasNext() ? itFirst.next() : null;
//             } else {
//                 result.add(x);
//                 x = itFirst.hasNext() ? itFirst.next() : null;
//             }
//         }
//         // operator ternalny jezeli poczatek sie zgadza to przypisz I argument,
//         // jak nie to II argument jak jezeli(x>y, x, y)
//     }
// }
