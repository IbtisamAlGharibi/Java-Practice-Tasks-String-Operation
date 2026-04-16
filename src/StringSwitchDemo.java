public class StringSwitchDemo {

    public static void main(String[] args){

        String deptName = "IT";
        System.out.println(deptName);

        switch (deptName){
            case "IT":
                System.out.println("IT department");
                break;
            case "BS":
                System.out.println("Business department");
                break;
            case "EN":
                System.out.println("Engineering deparment");
                break;
            default:
                System.out.println("Unknown department" );
        }

}}
