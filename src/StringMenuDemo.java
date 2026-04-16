import java.util.Scanner;

public class StringMenuDemo {
    public static void main(String[] args){
        System.out.println("Please enter a string");
        Scanner scan = new Scanner(System.in);
         String text = scan.next();

        System.out.println("1. Display Length");
        System.out.println("2. Convert to Uppercase");
        System.out.println("3. Convert to Lowercase");
        System.out.println("4. Check if string contains a word");
        System.out.println("5. Compare with another string (ignore case)");

        System.out.println("Please choose the number you want ");
        Scanner scan2 = new Scanner(System.in);
        int num = scan2.nextInt();

        if (num == 1){
            System.out.println(text.length());
        }else if (num == 2){
            System.out.println(text.toUpperCase());

        } else if (num == 3) {
            System.out.println(text.toLowerCase());

        } else if (num == 4) {
            System.out.println("Please enter the litter you want to check if its in string");
            Scanner scan3 = new Scanner(System.in);
            String letter = scan3.next();
            System.out.println(text.contains(letter));
        } else if (num == 4) {
            System.out.println("Please enter the string you want to compare with");
            Scanner scan4 = new Scanner(System.in);
            String str = scan4.next();
            System.out.println(text.equalsIgnoreCase(str));

        }else {
            System.out.println("number not in the menu");
        }


    }
}
