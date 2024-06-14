class Fibonacci
{
    public static void main(String []args)
    {
        int a=0;
        int b=1;
        int fib=a+b;
        for (int i=0;i<10;i++)
        {
            a=b;
            b=fib;
            fib=a+b;
             System.out.print(","+fib);
        }
           
    }
}
