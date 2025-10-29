package try_except;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args){

        File myObj = new File("file.txt");


        try (Scanner myReader = new Scanner(myObj)) {
            System.out.println("file opened");
        } catch (FileNotFoundException e) {
            System.out.println("File has not been found");
        }
    }
}
