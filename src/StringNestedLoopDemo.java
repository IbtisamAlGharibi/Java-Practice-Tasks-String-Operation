public class StringNestedLoopDemo {

    public static void main(String[] args){
        String str = "Ibtisam";
        String str2 = "Ibtisam";

        System.out.println(str);
        System.out.println(str2);
        System.out.println(str.length());
        System.out.println(str2.length());

        int count = 0;


        for (int i = 0; i < str.length(); i++) {

            for (int j = 0; j < str2.length(); j++) {

                if (str.charAt(i) == str2.charAt(j)) {
                    System.out.println(str.charAt(i));
                    count++;
                }
            }
        }



    }
}
