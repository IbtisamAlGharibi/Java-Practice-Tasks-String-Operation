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
        String word = "java";
        String word2 = "data";

        System.out.println(word);
        System.out.println(word2);

        for (int i = 0; i < word.length(); i++) {
            for (int j = 0; j < word2.length(); j++) {

                char ch = word.charAt(i);
                char ch2 = word2.charAt(j);

                if (ch == ch2) {
                    System.out.println(ch + " == " + ch2 + " (match)");
                } else {
                    System.out.println(ch + " != " + ch2);
                }
            }
        }


    }
}
