package javan;

import java.util.Scanner;

public class UlarTangga {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int i = 1;
        while (i <= n) {
            boolean ular = i %3 == 0;
            boolean tangga = i %5 ==0;

            if (ular && tangga) {
                System.out.println("ularTangga ");
            }
            else if(ular){
                System.out.println("ular ");
            }
            else if (tangga){
                System.out.println("tangga ");
            }
            else {
                System.out.println(i + " ");
            }
            i++;
        }
        System.out.println();
    }
}
