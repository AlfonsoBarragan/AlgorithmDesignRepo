/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2_juego;

import java.util.LinkedList;

/**
 *
 * @author alf
 */
public class Jugada {
    private LinkedList<Integer> divisoresUsados;
    private int numeroResult;

    public Jugada(LinkedList<Integer> divisoresUsados, int numeroResult) {
        this.divisoresUsados = divisoresUsados;
        this.numeroResult = numeroResult;
    }

    public LinkedList<Integer> getDivisoresUsados() {
        return divisoresUsados;
    }

    public void setDivisoresUsados(LinkedList<Integer> divisoresUsados) {
        this.divisoresUsados = divisoresUsados;
    }

    public int getNumeroResult() {
        return numeroResult;
    }

    public void setNumeroResult(int numeroResult) {
        this.numeroResult = numeroResult;
    }
    
    
}
