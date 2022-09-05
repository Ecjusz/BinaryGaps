package org.lisu;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        System.out.println(BinaryGaps());

}
    public static String Binary() {

        System.out.println("Enter number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        String binary = Integer.toBinaryString(number);
        System.out.println(binary);
        return binary;
    }

    public static int BinaryGaps() {
        String binary = Binary();
        int a = 0;
        int b = 0;

        if (binary.charAt(binary.length() - 1) == '1') {
            for (int i = 1; i <= binary.length() - 2; i++) {

                if (!(binary.charAt(i) == '0')) {
                    a = 0;
                } else {
                    if (b >= a) {
                        a = a + 1;

                        if (a>=b){
                            b=a;
                        }
                    }
                }
            }
            return b;
        }
        return 0;
    }
}
