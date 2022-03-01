/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ies.sauces.applicacionbanco;

/**
 *
 * @author daw1
 */
public class SaldoException extends Exception{

    public SaldoException(String message) {
        super("El dato introducido no es valido");
    }
    
}
