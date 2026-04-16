public class StringReverseDemo {

    public static void main(String[] args){
        String str = " I am solving my tasks regularly  ";
        System.out.println(str);

        System.out.println(str.length());

        int count = 0;

        for (int i=0; i<str.length();i++){
            System.out.println(str.charAt(i));
        }

        for (int i = str.length()- 1; i >= 0; i--){
            System.out.println(str.charAt(i));
        }

        for (int i=0; i<str.length();i++){
            if (str.charAt(i) == 'l'){
                count=+1;

            }
        }

    }
}
