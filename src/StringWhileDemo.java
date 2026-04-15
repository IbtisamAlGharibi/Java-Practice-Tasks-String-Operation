import java.util.Locale;

public class StringWhileDemo {
    public static void main(String[] args){
        String str = " I am solving my tasks regularly  ";
        System.out.println(str);

        System.out.println(str.length());
        int count = 0;
        int upper=0;
        int space = 0;

        while (count < str.length()){

            System.out.println(str.charAt(count));
            if (str.charAt(count) == ' ' ){
                space =+ 1;
            }
            if (Character.isUpperCase(count)){
                upper =+1;

            }
            count++;
        }

        System.out.println(upper);
        System.out.println(space);
        System.out.println(count);
    }
}
