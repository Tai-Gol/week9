package lambda;

import java.util.Scanner;

interface ConectStr{
    String operation(String l1,String l2);
}
public class Task10 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        String line1=input.nextLine();
        String line2=input.nextLine();

        ConectStr con=(x,y)->{
            String answ="";
            answ+=x;
            answ+=y;
            return answ;
        };
        System.out.println(con.operation(line1,line2));
    }
}
