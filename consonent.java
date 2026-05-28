import java.util.Scanner;

class sumofbound
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int a[][] = new int[10][10];

        System.out.print("Enter size : ");
        int n = sc.nextInt();

        System.out.println("Enter matrix : ");

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j] = sc.nextInt();
            }
        }

        int sum = 0;

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==0 || j==0 || i==n-1 || j==n-1)
                {
                    sum = sum + a[i][j];
                }
            }
        }

        System.out.println("Boundary sum = " + sum);
    }
}