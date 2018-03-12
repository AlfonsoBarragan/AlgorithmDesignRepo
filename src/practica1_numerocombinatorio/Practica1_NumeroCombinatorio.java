/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1_numerocombinatorio;
import java.io.*;
/**
 *
 * @author alf, rober
 */
public class Practica1_NumeroCombinatorio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        PrintWriter fichero = new PrintWriter("Benchmarks.txt", "UTF-8");
        int  index = 0;
        int[] n = new int[10], k = new int[10];
        long rit, rrec, rpilas, itTime, reTime, stTime;
        
        System.out.println("1 para introducir manualmente 1 número");
        System.out.println("2 para introducir manualmente n números");
        System.out.println("3 para una prueba con valores por defecto");
        
        switch(utilidades.Leer.cadena()) {
            
            case "1":
                index = 1;
                manualSingle(n, k);
                break;
                
            case "2":
                System.out.println("Cuántos números quieres meter? (max 10)");
                index = utilidades.Leer.entero();
                manualSeveral(n, k, index);
                break;
                
            case "3":
                index = 4;
                computerSample(n, k);
                break;
                
            default:
                System.out.println("Gracioso, que eres un gracioso");
                System.exit(1);
                break;        
        }
        
        
        for(int i = 0; i < index; i++){
            
            System.out.println("Calculando factorial de " + n[i] + ", " + k[i]);
            fichero.printf("Calculando factorial de %d, %d\n", n[i], k[i]);
            
            System.out.print("Iterativo:");
            itTime = System.currentTimeMillis();
            rit = (Algoritmos.combinatorioIterativo(n[i], k[i]));
            itTime = System.currentTimeMillis() - itTime;
            fichero.println("Iterativo: Tiempo: " + itTime + "ms Resultado: " + rit);
            System.out.println("Tiempo: " + itTime + "ms Resultado: " + rit);
            
            System.out.print("Recursivo:");
            reTime = System.currentTimeMillis();
            rrec = (Algoritmos.combinatorioRecursivo(n[i], k[i]));
            reTime = System.currentTimeMillis() - reTime;
            fichero.println("Recursivo: Tiempo: " + reTime + "ms Resultado: " + rrec);
            System.out.println("Tiempo: " + reTime + "ms Resultado: " + rrec);
            
            System.out.print("Pilas:");
            stTime = System.currentTimeMillis();
            rpilas = Algoritmos.combinatorioPilas(n[i], k[i]);
            stTime = System.currentTimeMillis() - stTime;
            fichero.println("Pilas: Tiempo: " + stTime + "ms Resultado: " + rpilas);
            System.out.println("Tiempo: " + stTime + "ms Resultado: " + rpilas);
            
            System.out.println("\n");
        }
    }
    
    public static void manualSingle(int[] n, int[] k) throws Exception {
        
        System.out.println("Introduzca los valores para calcular numero combinatorio nCk");
        
        System.out.println("*** Introduzca el valor de n ***");
        System.out.print("---->");
        n[0] = utilidades.Leer.entero();
        
        System.out.println("*** Introduzca el valor de k ***");
        System.out.print("---->");
        k[0] = utilidades.Leer.entero();
    }
    
    public static void manualSeveral(int[] n, int[] k, int index) throws Exception {
        
        for(int i = 0; i < index; i++){
            System.out.println("*** Introduzca el valor de n ***");
            System.out.print("---->");
            n[i] = utilidades.Leer.entero();
            
            System.out.println("*** Introduzca el valor de k ***");
            System.out.print("---->");
            k[i] = utilidades.Leer.entero();
        }
    }
    
    public static void computerSample(int[] n, int[] k) throws Exception {
        
        n[0] = 40; n[1] = 10; n[2] = 20; n[3] = 50;
        k[0] = 10; k[1] = 3; k[2] = 10; k[3] = 5;
    }
}
