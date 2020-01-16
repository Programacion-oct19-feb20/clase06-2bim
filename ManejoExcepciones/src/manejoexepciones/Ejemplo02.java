/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoexepciones;

/**
 *
 * @author reroes
 */
public class Ejemplo02 {
    public static void main(String[] args) {
        int valor1 = 10;
        int valor2 = 0;
        try{
        int resultado = valor1 / valor2;
       
        }catch(Exception e){
            System.out.printf("Ocurrió una excepción %s", e.toString());
        }       
    }
}
