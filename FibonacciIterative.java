public class FibonacciIterative implements Fibonacci
{
    public int fibonacci(int n)
    {
        int a = 0,b = 1,fib = 1;
        if (n == 0 || n == 1) return 1;
        for (int i = 0; i < n; i++) {
            a = b;
            b = fib;
            fib = a + b;
        }
        return a;
    }
}
