package fibonacci;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static long fibonacci(int n) {
        if (n <= 1) return n;
        else return fibonacci(n-1) + fibonacci(n-2);
    }

    public static void main(String[] args) {
        int n = 10;
        for (int i = 1; i <= n; i++)
            System.out.println(i + ": " + fibonacci(i));
    }
}
