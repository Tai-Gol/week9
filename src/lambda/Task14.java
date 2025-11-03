package lambda;

import java.util.Scanner;

interface StrWork{
    void lineW(String l);
}

public class Task14 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        String line1=input.nextLine();

        StrWork palindrome=(x)->{
          int len=x.length();
          boolean state=true;
          breakP:
          for (int i=0;i<len/2;i++){
              if(x.charAt(i)==x.charAt(len-i-1)){
                  continue;
              }else {
                  state=false;

//                  break breakP;
                    break ;
              }
          }
            System.out.println(state);
        };

        palindrome.lineW(line1);
    }
}
