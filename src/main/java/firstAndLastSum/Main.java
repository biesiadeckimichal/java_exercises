package firstAndLastSum;

public class Main {

//    Zadanie rozgrzewkowe
//    Napisz funkcję która dla podanego argumentu - tablicy jednowymiarowej liczb całkowitych
//    zwróci true gdy istnieje taka liczba należąca do tej tablicy że jest ona równa sumie
//    pierwszego i ostatniego  elementu tej tablicy
//    false - w przeciwnym wypadku
//
//    Np. dla tablicy [1,-1 ,0, 2]   - false
//            ---                  [3,  5, 1  ,-2] - true (bo 3 + (-2) = 1 które należy do tablicy)
//
//    !!!tak zaimplemenowac zeby byla minimalna liczba wszystkich operacji

    public static void main(String[] args) {
        int[] intArray = {2, 3, 1, -1};
        System.out.println(checkSum(intArray));

        System.out.println(findSmallestInt(intArray));

    }

    public static boolean checkSum(int[] intArray) {
        boolean result = false;
        int sum = intArray[0] + intArray[intArray.length - 1];
        for (int i = 1; i < intArray.length - 1; i++) {
            if (sum == intArray[i]) {
                result = true;
            }
        }
        return result;
    }

    public static int findSmallestInt(int[] args) {
        int smallest = args[0];
        for (int i = 0; i < args.length; i++) {
            if (args[i] < smallest) {
                smallest = args[i];
            }
        }
        return smallest;
    }
}
