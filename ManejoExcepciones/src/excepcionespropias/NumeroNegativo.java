/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepcionespropias;

/**
 *
 * @author reroes
 */
public class NumeroNegativo extends Exception {
    
    // se crea un constructor
    public NumeroNegativo(String mensaje){
        super(mensaje);
    }
}

