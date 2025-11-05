package lambda;

import java.util.ArrayList;
import java.util.Scanner;

public class Task23 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        ArrayList<String> arr=new ArrayList<>();

        System.out.println("length of the array:");
        int len= input.nextInt();
        for (int i = 0; i < len; i++) {
            arr.add(input.next());
        }

        StrCheck avrgL=(x)->{
            int l=x.size();
            int sum=0;
            for(String w:x){
                sum+=w.length();
            }
            int avg=sum/l;
            return "The average length of the lines: "+avg;
        };
        System.out.println(avrgL.func(arr));

    }
}
