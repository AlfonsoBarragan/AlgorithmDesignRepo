package practica1_numerocombinatorio;
 
import java.util.Stack;
 
/**
 *
 * @author alf
 */
public class Algoritmos {
   
    public static long combinatorioPilas(int n, int k) {
       
        int sol = 40;
        
        Stack<Integer> sN =         new Stack<Integer>();
        Stack<Integer> sK =         new Stack<Integer>();
        Stack<Integer> sResults =   new Stack<Integer>();
        Stack<Integer> sCalls =     new Stack<Integer>();
       
        sN.push(n);
        sK.push(k);
        sCalls.push(1);
        sResults.push(0);
       
        while (!sN.isEmpty()) {
            while ( (sK.peek() > 0) && (sN.peek() != sK.peek()) && 
                    sCalls.peek() <= 2) {
               
                switch(sCalls.peek()) {
                    case 1:
                        sN.push(sN.peek() - 1);
                        sK.push(sK.peek() - 1);
                        break;
                    
                    case 2:
                        sN.push(sN.peek() -1);
                        sK.push(sK.peek());
                        break;
                }
                sCalls.push(1);
                if(sK.peek() == 0 || sN.peek() == sK.peek()){
                    sResults.push(1);
                } else {
                    sResults.push(0);
                }
            }
               
            sN.pop();
            sK.pop();
            sCalls.pop();
            sol = sResults.pop();
               
            if(!sN.empty()) {
                sCalls.push(sCalls.pop() + 1);
                sResults.push(sResults.pop() + sol);
            }
        }
        if(sol == 0) sol = 1;
        return sol;
    }
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
