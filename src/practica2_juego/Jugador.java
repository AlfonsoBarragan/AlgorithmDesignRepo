/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2_juego;

import java.util.Iterator;
import java.util.LinkedList;
import utilidades.Grafos.*;
import practica2_juego.Jugada;

/**
 *
 * @author alf
 */
public class Jugador {
    
    private int numeroParaJugar;
    private int[] jugada;
    
    public int[] jugar(int numero){
        //Calcular divisores primos
        //desarrollar grafo
        //Concretar las situaciones victoriosas
        //Retornar accion
        
        LinkedList<Integer> divisores = new LinkedList<Integer>();
        divisores = factoresPrimos(numero);
        Iterator<Integer> itfactores = divisores.iterator();
        Jugada inicial = new Jugada(null, numero);
        
        
        Grafo<Jugada, Jugada> g;
        
        while(itfactores.hasNext()){
            
            int factorAux = itfactores.next();
            Jugada nueva = new Jugada()
        
        }
        
        
        
        
        return null;
    }
    
    public LinkedList<Integer> factoresPrimos(int numeroInit){
    int divisor = 2;
    int numero = numeroInit;
    LinkedList<Integer> factores = new LinkedList<Integer>();
    
    if(Integer.class.isInstance(numero)){ 
        if(numero > 1){ 
            for (int i = 0; i <= numeroInit; i++) { 
                if (numero % divisor == 0) {
                    System.out.println(divisor);
                    factores.add(divisor);
                    numero = numero/divisor; 
                }else{ 
                    divisor++; 
                } 
            }
        } 
    }
    return factores;
   } 
        
    public int getNumeroParaJugar() {
        return numeroParaJugar;
    }

    public void setNumeroParaJugar(int numeroParaJugar) {
        this.numeroParaJugar = numeroParaJugar;
    }
    
}
