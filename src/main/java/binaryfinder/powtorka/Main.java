package binaryfinder.powtorka;

public class Main {
    private static boolean find (double number, double []table) {
        int start = 0;
        int end = table.length - 1;
        boolean isThereNumber = false;

        while (start <= end) {
            int middle = (start + end) / 2;
            if (table[middle] == number) {
                return true;
            }

            if (number < table[middle]) {
                end = middle - 1;
            } else {
                start = middle + 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        double[] myArray = {1, 2, 12, 33, 40, 44};
        System.out.println(find(3, myArray));
    }
}
