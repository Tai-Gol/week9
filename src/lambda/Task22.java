package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

interface StrCheck{
     String func(ArrayList<String> li);
}
public class Task22 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        Scanner input=new Scanner(System.in);
        System.out.println("length of the arr:");
        int len= input.nextInt();
        System.out.println("fill the arr:");

        for (int i = 0; i < len; i++) {
            list.add(input.next());
        }
        StrCheck yeet =(x)->{
            boolean state=CheckCase(x.getFirst());//true=Upper, false=Lower
            for (int i = 1; i < x.size(); i++) {
                if(CheckCase(x.get(i))!=state){
                    return "Mixed case";
                } else if (i==x.size()-1) {
                    if(state==true){
                        return"All in upper case";
                    }else {
                        return"All in lower case";
                    }

                }
            }

            return "Mistake occured";
        };

        System.out.println(yeet.func(list));
    }
static boolean CheckCase(String w){
    if (w.toLowerCase().equals(w)){
        return false;
    }if (w.toUpperCase().equals(w)){
        return true;
    }
    return false;
};
}
