package lambda;

import java.util.Scanner;

interface CountW{
    int operation(String l);
}
public class Task13 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        String line1=input.nextLine();

        CountW con=(x)->{
            String[] words=x.split(" ");
            int l=words.length;
            return l;
        };
        System.out.println(con.operation(line1));
    }
}
