import java.util.Scanner;

class revrow
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int a[][] = new int[10][10];

        System.out.print("Enter rows : ");
        int r = sc.nextInt();

        System.out.print("Enter columns : ");
        int c = sc.nextInt();

        System.out.println("Enter matrix : ");

        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Reverse row matrix : ");

        for(int i=r-1;i>=0;i--)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(a[i][j] + " ");
            }

            System.out.println();
        }
    }
}