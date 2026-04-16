public class StringIfElseIfDemo {
    public static void main(String[] args){

        String name = "Ibtisam";
        System.out.println(name);

        String name2 = "ibtisam";

        if (name == " ") {
            System.out.println("the string is empty");
        } else if ( name.length() < 5) {
            System.out.println("String is less than 5");

        } else if (name.startsWith("I")) {
            System.out.println("string starts with I");
        } else if (name.endsWith("n")) {
            System.out.println("string ends with n");
        }else if (name.equalsIgnoreCase(name2)){
            System.out.println("Both names are equals");

        }else {
            System.out.println("none of the conditions met");
        }





    }}
