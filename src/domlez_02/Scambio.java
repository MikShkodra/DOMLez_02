/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domlez_02;

import java.util.Scanner;

/**
 *
 * @author tss
 */
public class Scambio {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Inserisci primo numero: ");
        int op1 = s.nextInt();

        System.out.println("Inserisci secondo numero: ");
        int op2 = s.nextInt();

        int z = op1;
        op1 = op2;
        op2 = z;

        System.out.println("op1 contiene: " + op1 + ", op2 contiene: " + op2);
        //oppure
 
        System.out.println(String.format("OP1 vale %s, OP2 vale %s", op1, op2));

    }

}
