import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args){
        try {
            Methods methods = new Methods();
            methods.readFile();

        } catch (IOException | InvalidNumberEXC e){
            e.printStackTrace();
        }

        int[] arr = {5,6,7,8,3,12,54,25,76,14};
        Methods methods = new Methods();
        System.out.println("რიცხვების ჯამია: " + methods.sumNumbers(arr));



    }
}
