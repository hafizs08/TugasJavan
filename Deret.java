package javan;

import java.util.Scanner;

public class Deret {
    public static String printNumber(int input) {
        StringBuilder result = new StringBuilder();
        boolean a = true;
        int temp  = 1 ;
        for (int i = 1; i <= input; i ++){
            if (temp != i && a == false){
                result.append("*");
                temp +=i+1;
                a = true;
            } else if (i % 2 != 0){
                result.append(i);
                a = false;
            }
            else {
                result.append(i);
            }
            if (i <input){
                result.append(" ");
            }
            
        }
        return result.toString();
    }

     public static void main (String[] args) {
         Scanner scanner = new Scanner(System.in);
         int input = scanner.nextInt();
         System.out.println(input + " : " + printNumber(input));
     }
}
