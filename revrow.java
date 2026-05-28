import java.util.Scanner;

class insert
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

        System.out.print("Enter position : ");
        int p = sc.nextInt();

        System.out.print("Enter value : ");
        int v = sc.nextInt();

        for(int i=n;i>=p;i--)
        {
            a[i] = a[i-1];
        }

        a[p-1] = v;

        n++;

        System.out.println("Array after insert : ");

        for(int i=0;i<n;i++)
        {
            System.out.print(a[i] + " ");
        }
    }
}