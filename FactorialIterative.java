public class FactorialIterative implements Factorial
{
public int factorial(int n)
    {
        int fact = 1;
        for (int x = n; x > 1; x--) fact *= x;
        return fact;
    }
}
