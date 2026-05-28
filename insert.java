package Day1;
import java.util.Scanner;

class difference
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number : ");
        int a = sc.nextInt();

        System.out.print("Enter second number : ");
        int b = sc.nextInt();

        int d = a - b;

        System.out.println("Difference = " + d);
    }
}