package try_except;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args){
        ArrayList<Integer> arr=new ArrayList<>();
        File file=new File("C://Users//lenovo//Desktop//opp//week9//src//try_except//num.txt");



        try(Scanner read=new Scanner(file)){
            while(read.hasNextLine()){
                String line= read.nextLine();
                String[] s= line.split(",");
                for (int i=0; i<s.length;i++ ){
                    arr.add(Integer.parseInt(s[i]));

                }
            }
        }catch (FileNotFoundException e){
            System.out.println("not found");
            e.printStackTrace();
        }

        for (int i=0;i<arr.size();i++){
            if (arr.get(i)>0){
                throw new RuntimeException("It is a positive number");
            } else{
                System.out.println(arr.get(i));
            }
        }



    }
}
