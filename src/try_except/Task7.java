package try_except;

import com.sun.jdi.event.BreakpointEvent;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args){
        File str = new File("C://Users//lenovo//Desktop//opp//week9//src//try_except//vow.txt");
        ArrayList<String> lines=new ArrayList<>();
        String vowels="aoueiy";

        try (Scanner reader=new Scanner(str)){
            while (reader.hasNextLine()){
                String line=reader.nextLine();
                lines.add(line);
            }
        }catch(FileNotFoundException e){
            System.out.println("File is not found");
            e.printStackTrace();
        }
        System.out.println(lines);

        for(int i=0;i<lines.size();i++){
            String l= lines.get(i);
            vow_found:
            for (int k=0;k<vowels.length();k++){
                for (int j=0;j<l.length();j++){
                    if (l.charAt(j)==vowels.charAt(k)){
                        System.out.println("got it");
                        break vow_found;
                    }else{
                        if(k==vowels.length()-1 && j==l.length()-1){
                            throw new RuntimeException("no vowels in this line!");
                        }
                    }
                }
            }

        }
    }
}
