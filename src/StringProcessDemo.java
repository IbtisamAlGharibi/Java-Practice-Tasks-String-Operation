import java.awt.*;

public class StringProcessDemo {

    public static void main(String[] args){

        String str = "001,Ibtisam,It  ";
        System.out.println(str);

        System.out.println(str.trim());
        System.out.println(str.split(""));

        String[] array = str.split("");
        for (int i = 0; i<array.length-1;i++){
            System.out.println(array[i]);
        }






    }
}
