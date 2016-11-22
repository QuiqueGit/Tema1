/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema1;

import java.util.Scanner;

/**
 *
 * @author AlumMati
 */
public class Ejer_multiplo {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int a;

        System.out.println("Introduce un numero");
        a = tec.nextInt();
        if (a % 3 == 0) {
            System.out.println("El numero " + a + " es multiplo de tres");
        } else {
            System.out.println("El numero " + a + " no es multiplo de tres");

        }

    }
}
