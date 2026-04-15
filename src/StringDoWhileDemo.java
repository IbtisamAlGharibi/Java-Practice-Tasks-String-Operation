public class StringDoWhileDemo {

    public static void main(String[] args){

        String str = " I am solving my tasks regularly  ";
        System.out.println(str);

        System.out.println(str.length());

        int i = 0;
        int lower = 0;
        int space = 0;

        do {
            char ch = str.charAt(i);
            System.out.println(ch);

            if (Character.isLowerCase(ch)) {
                lower++;
            }

            if (ch == ' ') {
                space++;
            }

            i++;

        } while (i < str.length());

        System.out.println(lower);
        System.out.println( space);
    }
}
