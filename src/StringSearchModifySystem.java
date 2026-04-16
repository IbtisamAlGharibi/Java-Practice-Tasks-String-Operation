import java.util.Scanner;

public class StringSearchModifySystem {
    public static void main(String[] args){
        System.out.println("Please enter a string");
        Scanner scan = new Scanner(System.in);
        String text = scan.next();

        System.out.println("Please enter a word you want to check if its in string");
        Scanner scan3 = new Scanner(System.in);
        String word = scan3.next();
        System.out.println(text.contains(word));

        System.out.println("Please enter a word you want to replace it in string");
        String rep = scan3.next();
        System.out.println("Please enter a word you want to replace it with the word");
        String newRep = scan3.next();
        System.out.println(text.replace(rep,newRep));



    }}
