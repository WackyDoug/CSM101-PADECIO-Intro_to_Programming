package PadecioCSM101.HomeCode;

import java.util.Scanner;

public class AverageCal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean live = true;
        int count = 1;
        int len = 0;
        double old = 0;

        System.out.println("(x) to calculate avr and end program");
        while (live){

            System.out.printf("Input number #%d > ", count);

            if (sc.hasNextDouble()){
                double validNum = sc.nextDouble();
                old += validNum;
                count += 1;
                len += 1;
            }

            else if (sc.hasNext()){
                String validL = sc.next();

                if (validL.equalsIgnoreCase("x")){
                    if (len > 0){
                        double avr = old / len;
                        System.out.printf("Average is %.2f\n", avr);
                    }
                    else{
                        System.out.println("No input were inputed");
                    }
                    live = false;
                }
                else{
                    System.out.println("invalid input");
                }
            }
        }
        sc.close();
    }
}
