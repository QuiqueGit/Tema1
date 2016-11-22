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
public class Ejer1 {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        String nombre;
        int edad;

        System.out.print("Dame tu nombre: ");
        nombre = tec.nextLine();
        System.out.println("Hola " + nombre);
        System.out.println("Dame tu edad");
        edad = tec.nextInt();
        System.out.println("Hola " + nombre + " tienes " + edad + " años?");

    }

}
