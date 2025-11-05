package lambda;

import java.util.Scanner;

interface Bin{
    String function(int c);
}

public class Task25 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num= input.nextInt();

        Bin binary=(x -> {
            String binN="";
            while (x>=1){
                binN=(x%2)+binN;
                x=x/2;
            }

            return binN ;
        });
        String s=binary.function(num);
        System.out.println(s);
    }
}
