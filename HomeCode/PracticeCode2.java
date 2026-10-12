package PadecioCSM101.HomeCode;
import java.util.Scanner;

public class PracticeCode2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double[] num = new double[11];

        for (int i = 0; i <= 10; i++){
            num[i] += i;
            System.out.printf("%.0f ", num[i]);
        }
    }

}
