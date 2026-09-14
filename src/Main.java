import java.util.Scanner;

class FibonacciNumber1{

    public static void main(String[] args)
    {
        int n, a = 0, b = 1 , c ;

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the numebr ");

         n = sc.nextInt();

        for(int i=0; i<n; i++)
        {
            System.out.println(a);
            c = a + b;
            a = b;
            b = c;
        }
    }
}