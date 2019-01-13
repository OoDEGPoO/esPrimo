/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esprimo;

import java.util.Scanner;

/**
 *
 * @author diego
 */
public class EsPrimo {

    /**
     * @param args the command line arguments
     */
    public static boolean esPrimo(int x){
        return ifPrimo(x, 2);
    }
    
    private static boolean ifPrimo(int x, int c){
        boolean out = false;
        
        if (x == c) out = true;
        else {
            int r = x%c;
            if (r != 0) out = ifPrimo(x, c+1);
        }
        
        return out;
    }
    
    public static void main(String[] args) {
        int x = 0;
        
        if (args.length > 0) x = Integer.parseInt(args[0]);
        else {
            Scanner in = new Scanner(System.in);
            System.out.println("Introduce un numero entero válido:\n");
            x = in.nextInt();
        }
        
        if (esPrimo(x))
            System.out.println("Si, si es Primo");
        else
            System.out.println("No, no es Primo");
    }
    
}
