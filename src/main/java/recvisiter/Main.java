package recvisiter;

public class Main {
    public static void main(String[] args) {
        System.out.println(fib(4));
    }
    private static int fib(int n) {
        int f1 = 1;
        int f2 = 1;
        int temp;
        for (int i = 3; i <= n; i++) {
            temp = f2;
            f2 = f1 + f2;
            f1 = temp;
        }

//        while (n > 2) {
//            int temp = f2
//            f2 = f1 + f2;
//            f1 = temp;
//            n--;
//        }

        return f2;
    }
}
