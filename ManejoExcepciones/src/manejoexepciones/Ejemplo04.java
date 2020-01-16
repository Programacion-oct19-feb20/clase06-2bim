/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoexepciones;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo04 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        try {
            System.out.println("Ingrese valor 1 a operar: ");
            int valor1 = entrada.nextInt();
            System.out.println("Ingrese valor 2 a operar: ");
            int valor2 = entrada.nextInt();
            int resultado = valor1 / valor2;
            System.out.printf("Resultado %s\n", resultado);
        } catch (ArithmeticException e) {
            System.out.printf("(ArithmeticException) Ocurrió una "
                    + "excepción %s\n", e.toString());
        } catch (Exception e) {
            System.out.printf("Ocurrió una excepción %s\n", e.toString());
        }
    }
}
