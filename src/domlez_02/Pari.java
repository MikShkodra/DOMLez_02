package domlez_02;

import java.util.Scanner;

public class Pari {

    public static void main(String[] args) {
        //start
        Scanner s = new Scanner(System.in);

        System.out.println("Input num: ");
        int n = s.nextInt();

        /*  float ris = n / 2f;
        *   System.out.println(String.format("RIS contains: %s", ris));     */
        int resto = n % 2;

        if (resto == 0) {
            System.out.println("Num is EQUAL ");
        } else {
            System.out.println("Num is ODD");

                // VARIANTE PIÙ BREVE
            
        } System.out.println("Input numB: ");
        int ß = s.nextInt();
        
        if (ß % 2 == 0) {
            System.out.println("NumB is EQUAL ");
        } else {
            System.out.println("NumB is ODD");
        }

    }
}
