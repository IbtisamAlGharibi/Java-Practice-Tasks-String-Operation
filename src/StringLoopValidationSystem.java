import java.util.Scanner;

public class StringLoopValidationSystem {
    public static void main(String[] args){
        System.out.println("Please enter a string");
        Scanner scan = new Scanner(System.in);
        String text = scan.next();

        System.out.println(text.length());
        int count =0;
        for (int i=0; i<text.length();i++){
            if (text.charAt(i) == 'o' || text.charAt(i) == 'a' || text.charAt(i) == 'u'
                    || text.charAt(i) == 'e' || text.charAt(i) == 'i'){
                count =+1;}
            System.out.println(text.charAt(i));

        }


    }}
