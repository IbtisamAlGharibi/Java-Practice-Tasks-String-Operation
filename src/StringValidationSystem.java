import java.util.Scanner;

public class StringValidationSystem {
    public static void main(String[] args){
        System.out.println("Please enter a string");
        Scanner scan = new Scanner(System.in);
        String text = scan.next();

        System.out.println(text.length());
        System.out.println(text.toUpperCase());
        System.out.println(text.toLowerCase());

        System.out.println("Please enter a word you want to check if its in string");
        Scanner scan3 = new Scanner(System.in);
        String word = scan3.next();
        System.out.println(text.contains(word));


        System.out.println("Please enter a string you want to compare with");
        Scanner scan4 = new Scanner(System.in);
        String str = scan4.next();
        System.out.println(text.equalsIgnoreCase(str));

        System.out.println(text.substring(0,2));

        if (text.length() > 5){
           System.out.println("text is greater than 5");
        }else {

            System.out.println("text is less than 5");
        }

    }}
