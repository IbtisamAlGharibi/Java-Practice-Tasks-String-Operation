public class StringIfElseDemo {
    public static void main(String[] args){

        String userName = "Ibtisam";
        System.out.println(userName);

        int size = userName.length();

        if (size >5){
            System.out.println("The condition is True");
        }else {

            System.out.println("user name is too short");
        }

    }
}
