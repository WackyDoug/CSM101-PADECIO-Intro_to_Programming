package PadecioCSM101.HomeCode;

import java.util.Scanner;

public class PracticeCode {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] num = new int[10];

        for (int i = 0; i < 10 ; i ++){
            System.out.printf("Please enter value for array list %d > ", i);
            num[i] = sc.nextInt();
        }

        System.out.print("Enter the number to check > ");
        int check = sc.nextInt();

        int count = 0;
        for (int i = 0; i < 10 ; i ++) {
            if (num[i] == check){
                count += 1;
            }
        }
        System.out.printf("The number occured %d times", count);

    }
}
