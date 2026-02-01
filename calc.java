import java.util.Scanner;

public class calc
{
    public static void main (String []args)
    {
        Scanner scan = new Scanner (System.in);
        int ans=0;

            System.out.print("Enter Num1: ");
            int num1 = scan.nextInt();

            System.out.print("Enter Num2: ");
            int num2 = scan.nextInt();

                if(num1 !=0 && num2 !=0)
                    {
                        ans = num1+num2;
                    }

            System.out.println("\nCOMPUTATION: \n" + num1 + " + " + num2 + " = " + ans );
    }
}


