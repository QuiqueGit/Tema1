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
public class Ejer2 {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int a, b;

        System.out.println("Introduce dos numeros");
        a = tec.nextInt();
        b = tec.nextInt();

        if (a > b) {
            System.out.println("El mayor es : " + a);
        } else {
            System.out.println("El mayor es : " + b);
        }

    }

}
