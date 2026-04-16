import java.util.Scanner;

public class StringCompareValidateSystem {

    public static void main(String[] args){
        System.out.println("Please enter a string");
        Scanner scan = new Scanner(System.in);
        String text = scan.next();

        System.out.println(text.length());
        System.out.println("Please enter a string you want to compare with");
        Scanner scan4 = new Scanner(System.in);
        String str = scan4.next();
        System.out.println(text.equals(str));

        System.out.println("Please enter a value that you want to check if the text starts with");
        String start = scan4.next();
        System.out.println(text.startsWith(start));


        System.out.println("Please enter a value that you want to check if the text ends with");
        String end = scan4.next();
        System.out.println(text.endsWith(end));

        if (text.length() > 8){
            System.out.println("text is greater than 8");
        }else {

            System.out.println("text is less than 8");
        }

    }}

