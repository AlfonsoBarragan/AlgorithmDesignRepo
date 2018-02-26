/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1_numerocombinatorio;

/**
 *
 * @author alf
 */
public class Algoritmos {
    
    
    public static int combinatorioRecursivo(int n, int k){
        if(k==0 || k==n){
            return 1;
        }else{
            return combinatorioRecursivo(n-1,k-1)+ combinatorioRecursivo(n-1,k);
        }
    }
    
    public static long combinatorioIterativo(int n, int k){
        long factorialk = 1;
        long factorialn = 1;
        long factorialnk = 1;

        //Esto saca el factorial de n
        for (int i = 1; i < n+1; i++) {
            factorialn = i * factorialn;
        }

        //Esto saca el factorial de k
        for (int i = 1; i < k+1; i++) {
            factorialk = i * factorialk;
        }

        //Esto saca el factorial de n-k:
        for (int i = 1; i < (n - k + 1); i++) {
            factorialnk = i * factorialnk;
        }

        //Esto calcula el combinatorio de n & k:
        return(factorialn / (factorialk * factorialnk));

    }
}
