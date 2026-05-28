import java.util.Scanner;

class minmax
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int a[] = new int[20];

        System.out.print("Enter size : ");
        int n = sc.nextInt();

        System.out.println("Enter elements : ");

        for(int i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }

        int min = a[0];
        int max = a[0];

        for(int i=1;i<n;i++)
        {
            if(a[i] < min)
            {
                min = a[i];
            }

            if(a[i] > max)
            {
                max = a[i];
            }
        }

        System.out.println("Minimum = " + min);
        System.out.println("Maximum = " + max);
    }
}