package lambda;

import java.util.Scanner;

public class Task24 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        int num= input.nextInt();
        Fact check=(x -> {
            int max=0;
            for (int i = 1; i <= x; i++) {
                if (CheckPrime(i)){
                    if(x%i==0){
                        max=i;
                    }
                }
            }
            return max;
        });

        System.out.println(check.func(num));

    }

    static boolean CheckPrime(int x){
        boolean state = false;
        if (x==2){
            return true;
        }
        for (int i = 2; i < x; i++) {
            if (x%i==0){
                state=false;
                break;
            }else{
                if(i==x-1){
                    state=true;
                }
            }
        }

        return state;
    }


}
