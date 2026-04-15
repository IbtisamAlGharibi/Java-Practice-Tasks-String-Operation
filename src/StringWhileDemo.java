public class StringWhileDemo {
    public static void main(String[] args){
        String str = " I am solving my tasks regularly  ";
        System.out.println(str);

        System.out.println(str.length());
        int count = 0;

        while (count < str.length()){

            System.out.println(str.charAt(count));
            if (str.charAt(count) == ' ' ){

            }
        }
    }
}
