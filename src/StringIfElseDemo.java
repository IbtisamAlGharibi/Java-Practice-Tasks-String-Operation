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

        String password = "Abc123";
        String target = "abc1234";

        if (password == target){
            System.out.println("Password correct you can enter!");
        } else if (userName ==" ") {
            System.out.println("user name is empty");
        } else if (userName.contains("I")) {
            System.out.println("user name contains I");

        } else {
            System.out.println("Wrong password, please try again!");
        }

        

    }
}
