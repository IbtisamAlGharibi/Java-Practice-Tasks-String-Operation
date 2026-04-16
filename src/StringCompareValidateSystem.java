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

    }}

