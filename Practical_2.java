
import java.util.Scanner;

public class Practical_2
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your Mobile number: ");
        String number=scanner.nextLine();
        int[] NUmber=new int[10];
        for (int i = 0; i < 10; i++) {
            if (Character.isDigit(number.charAt(i))) {
                NUmber[i] = Character.getNumericValue(number.charAt(i));
            }
        }
        int j;
        System.out.print("MOBILE SYSTEM OPERATING CODE: ");
        for(j=0;j<2;j++)
        {
                System.out.print(NUmber[j]);
        }
        System.out.println("");
        System.out.print("MSC CODE: ");
        for(j=2;j<5;j++)
        {
                System.out.print(NUmber[j]);
        }
        System.out.println("");
        System.out.print("UNIQUE CODE: ");
        for(j=5;j<10;j++)
        {
                System.out.print(NUmber[j]);
        }
        scanner.close();
    }
}
