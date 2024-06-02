public class recursionfibonacci {
    public static int fibonacci(int n)
    {
        if(n==0||n==1)
        {
            return 1;
        }
        int fib1=fibonacci(n-1);
        int fib2=fibonacci(n-2);
        int fib=fib1+fib2;
        return fib;
    }
public static void main(String args[])
{
    int n=5;
    System.out.println(fibonacci(n));
}
}
