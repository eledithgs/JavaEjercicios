/*
 * Realizar un juego paea adivinar un numero. Generar un numero aleatorio entre 0-100, 
    y luego ir pidiendo numeros indicando "es mayor" o "es menor" segun sea el caso respecto a N
    Termina cuando el usuario acierta y muestra el numero de intentos
 */

package com.mycompany.juego;

import javax.swing.JOptionPane;

/**
 *
 * @author Eledith Gonzalez
 * Inspirado en migueltaboadas@hotmail.com
 */
public class Juego {

    public static void main(String[] args) {
        int numero, aleatorio, intentos = 0;
       
        aleatorio = (int)(Math.random()*100); 
//multiplicamos por 100 para que asi nos de un numero entre 0 y 100, ademas de convertirlo a entero

        do {            
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
            if (aleatorio > numero) {
                JOptionPane.showMessageDialog(null, "Digita un numero mayor");
            }else{
                JOptionPane.showMessageDialog(null, "Digita un numero menor");
            }
            intentos ++; // Aumentamos en uno el contador
        } while (numero != aleatorio);
        
        JOptionPane.showMessageDialog(null, "Intentos realizados: "+intentos+"\n El numero era "+aleatorio);
    }
}
