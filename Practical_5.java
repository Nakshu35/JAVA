import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
public class Practical_5 {
    public static void check_anagram(String Input_string,String anagram_string)
    {
        int length_ofInput_string= Input_string.length();
        int length_ofanagram_string= anagram_string.length();
        char[] array_Input= new char[length_ofInput_string];
        char[] array_anagram= new char[length_ofanagram_string];
        for(int i=0;i<length_ofInput_string;i++)
        {
            array_Input[i]=Input_string.charAt(i);
        }
        //assign anagram character to character array
        for(int i=0;i<length_ofanagram_string;i++)
        {
            array_anagram[i]=anagram_string.charAt(i);
        }
        if (length_ofanagram_string == length_ofInput_string)
        {
            //sorting INput string
            for(int i=0;i<length_ofInput_string;i++)
            {
                for(int j=0;j<length_ofInput_string-1;j++)
                {
                    if(array_Input[j]>array_Input[j+1])
                    {
                        char temp=array_Input[j];
                        array_Input[j]=array_Input[j+1];
                        array_Input[j+1]=temp;
                    }
                }
            }
            //sorting anagram string
            for(int i=0;i<length_ofanagram_string;i++)
            {
                for(int j=0;j<length_ofanagram_string-1;j++)
                {
                    if(array_anagram[j]>array_anagram[j+1])
                    {
                        char temp=array_anagram[j];
                        array_anagram[j]=array_anagram[j+1];
                        array_anagram[j+1]=temp;
                    }
                }
            }
            if(Arrays.equals(array_Input, array_anagram))
            {
                System.out.println("YES, its an anagram");
            }
            else
            {
                System.out.println("No, it is not an anagram");
            }
        }
        else
        {
            System.out.println("NO, it is not an anagram");
        }
        int i=0;
        Random random= new Random();
        while(i<length_ofInput_string)
        {
            int j = random.nextInt(length_ofInput_string);
            char temp = array_Input[i];
            array_Input[i]=array_Input[j];
            array_Input[j]=temp;
            i++;
        }
        System.out.print("Anagram string is ");
        System.out.print(array_Input);
    }
    public static void main(String[] args) {
        String Input_string,anagram_string;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a String: ");
        Input_string= scan.nextLine();
        System.out.print("Enter a anagram String: ");
        anagram_string = scan.nextLine();
        check_anagram(Input_string,anagram_string);
    }
}