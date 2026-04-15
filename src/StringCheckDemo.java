public class StringCheckDemo {
    public static void main(String[] args){
        String str = " I am solving my tasks regularly  ";
        System.out.println(str);

        System.out.println(str.substring(2,6));

        System.out.println(str.replace("regularly","patiently"));
        boolean check = str.contains("my");
        System.out.println(check);

        System.out.println(str.charAt(6));
        String str2 = "Some Tasks are not completed";
        System.out.println(str2.toUpperCase());


    }

}
