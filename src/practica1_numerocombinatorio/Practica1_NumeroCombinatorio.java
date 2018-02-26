/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1_numerocombinatorio;

import java.util.Scanner;

/**
 *
 * @author alf
 */
public class Practica1_NumeroCombinatorio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        int n = 0;
        int k = 0;
        
        System.out.println("Introduzca los valores para calcular numero combinatorio nCk");
        System.out.println("*** Introduzca el valor de n ***");
        System.out.print("---->");
        n = utilidades.Leer.entero();
        
        System.out.println("*** Introduzca el valor de k ***");
        System.out.print("---->");
        k = utilidades.Leer.entero();
       
        System.out.println(Algoritmos.combinatorioIterativo(n, k));
        
        System.out.println(Algoritmos.combinatorioRecursivo(n, k));
    
    }
    
}
