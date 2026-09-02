public class Nto1 {
    public static void main(String[] args) {
        fun(5);
    }

    static void fun(int n) {
        // 1. Base condition must come first
        if (n == 0) {
            return;
        }
        System.out.println(n);
        // 3. Recursive call with smaller input
        fun(n - 1);
        // 2. Work (print current number)
        System.out.println(n);

    }
}