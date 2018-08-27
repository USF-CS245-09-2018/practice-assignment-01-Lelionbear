public class FactorialRecursive implements Factorial
{
    private int fact = 1;
    public int factorial(int n)
    {
        if (n < 0){
            return 0;
        }
        else if (n == 0){
            return 1;
        }
        else{
            return factorial(n-1) * n;
        }
    }
}
