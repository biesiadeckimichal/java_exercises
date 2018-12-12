package binaryfinder;

public class Main {
    // wiemy ze t jest posortowana niemalejaco
    // np. t = 3...5....6
    private static boolean find(double x, double []T) {
        int i = 0, j = T.length - 1;

        while (i <= j) {
            int s = (i + j) / 2;
            if (T[s] == x) {
                return true;
            }

            if (x < T[s]) {
                // trzeba szukac x w lewej czesci
                j = s - 1;
            } else {
                i = s + 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        double []test1 = {3, 4, 5};
        System.out.println(find(3,test1));
    }
}
