import java.util.Scanner;
        public class Practical_4
        {
            public static void main(String[] args)
            {
                Scanner scan=new Scanner(System.in);
                String[] alphabet = {
                        "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M",
                        "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"
                };
                String[] morseCode = {
                        ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..",
                        ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.",
                        "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."
                };
                while(true){
                System.out.print("Enter 1 for string to morse code:\nEnter 2 for morsecode to string:\nEnter 3 for Exit:\n");
                int input= scan.nextInt();
                scan.nextLine();
                if(input==1) {
                    System.out.print("Enter a sentence: ");
                    String sentence = scan.nextLine();
                    for (int i = 0; i < sentence.length(); i++) {
                        char letter = Character.toUpperCase(sentence.charAt(i));
                        if (letter == ' ') {
                            System.out.print("  ");
                        } else {
                            for (int j = 0; j < alphabet.length; j++) {
                                int value1 = letter;
                                int value2 = alphabet[j].charAt(0);
                                if (value1 % value2 == 0) {
                                    System.out.print(morseCode[j]);
                                    System.out.print(" ");
                                }
                            }
                        }
                    }
                    System.out.println();
                }
                if(input==2)
                {
                    int a=0;
                    System.out.print("Enter a morsecode: ");
                    String morsecode = scan.nextLine();
                    String[] toconvertcode= morsecode.split("  ");
                    for (String word : toconvertcode)
                    {
                        String[] letters = word.split(" "); // Split letters by single space
                        for (String letter : letters) {
                            for (int j = 0; j < morseCode.length; j++) {
                                if (letter.equals(morseCode[j])) {
                                    if(a==0) {
                                        System.out.print(alphabet[j]);
                                    }
                                    else {
                                        System.out.print(alphabet[j].toLowerCase());
                                    }
                                    a++;
                                    break;
                                }
                            }
                        }
                        System.out.print(" ");
                    }
                    System.out.println();
                }
                else if (input==3) {
                    break ;
                }
            }
            }
        }