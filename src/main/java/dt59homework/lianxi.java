package dt59homework;

import java.util.Scanner;

public class lianxi {

    private static Scanner scanner;

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int ary[] = new int[] { 32, 33, 43, 34, 23 };
        System.out.println(ary[2]);

        double b = 38.856;
        System.out.println((char) b);

        int a = 4;
        switch (a) {
        case (1):
            System.out.println("iiiiiii");
            break;
        case (2):
            System.out.println("2222222");
            break;
        case (3):
            System.out.println("22222333");
            break;
        default:
            System.out.println("33444333");
        }

        int p = 1;
        while (p < 3) {
            System.out.println("HAHAHHHAHA");
            p = p + 1;

            break;
        }

        int l = 1;
        do {
            System.out.println("33333333");
            l = l + 1;
        } while (l < 3);

        for (int z = 1; z < 10; z++) {

            for (int x = 1; x < 5; x++) {

                System.out.print("*");
                if (x == 2) {

                    System.out.println("i");
                    continue;
                }
            }

        }

        int abc[] = new int[] { 54, 33, 76, 98, 67, 54, 32 };
        for (int u = 0; u < abc.length - 1; u++) {
            for (int k = 0; k < abc.length - 1 - u; k++) {
                int temp = abc[k];
                abc[k] = abc[k + 1];
                abc[k + 1] = temp;
            }
        }
        for (int m : abc) {
            System.out.print(m + "\t");
        }

    }

}
