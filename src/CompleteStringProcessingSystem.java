import java.util.Scanner;

public class CompleteStringProcessingSystem {

    public static void main(String[] args){
        System.out.println("Please enter a string");
        Scanner scan = new Scanner(System.in);
        String text = scan.next();
        System.out.println(text.length());

        System.out.println(text.toUpperCase());
        System.out.println(text.toLowerCase());


        System.out.println("Please enter a word you want to check if its in string");
        String word = scan.next();
        System.out.println(text.contains(word));

        System.out.println("Please enter a string you want to compare with");
        String str = scan.next();
        System.out.println(text.equalsIgnoreCase(str));





}}

