package try_except;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args){

        File file=new File("C://Users//lenovo//Desktop//opp//week9//src//try_except//ept.txt");


        try(Scanner read=new Scanner(file)){
            if (read.hasNextLine())
            {
                System.out.println("file is not empty");
            }else {
                throw new RuntimeException("The file is empty");
            }
        }catch (FileNotFoundException e){
            System.out.println("not found");
            e.printStackTrace();
        }
    }
}
