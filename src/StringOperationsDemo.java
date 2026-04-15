public class StringOperationsDemo {
    public static void main(String[] args){

        String customerName = "Ibtisam";
        System.out.println(customerName);

        System.out.println(customerName.length());
        System.out.println(customerName.toUpperCase());
        System.out.println(customerName.toLowerCase());

        String companyName = "Codeline";

        String combained = "name:" + customerName + " "+ "company:" + companyName;
        System.out.println(combained);



    }
}
