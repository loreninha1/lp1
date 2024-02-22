/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package llc.lista3;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class LlcLista3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner (System.in);
        System.out.println("Insira o primeiro intervalo de tempo:");
        System.out.println("Horas: ");
        int h1 = in.nextInt();
        System.out.println("Minutos: ");
        int m1 = in.nextInt();
        System.out.println("Segundos: ");
        int s1 = in.nextInt();
        
        System.out.println("\nDigite o segundo intervalo de tempo:");
        System.out.println("Horas: ");
        int h2 = in.nextInt();
        System.out.println("Minutos: ");
        int m2 = in.nextInt();
        System.out.println("Segundos: ");
        int s2 = in.nextInt();
        
        int somaH = h1 + h2;
        int somaMin = m1 + m2;
        int somaSeg = s1 + s2;
        
        if (somaSeg >= 60){
            somaSeg -= 60;
            somaMin++;
        }
        if (somaMin >= 60){
            somaMin -= 60;
            somaH++;
        }
        int difH = h1 - h2;
        int difMin = m1 - m2;
        int difSeg = s1 - s2;
        
        System.out.println("\nSoma dos intervalos:");
        System.out.println("Horas: " + somaH);
        System.out.println("Minutos: " + somaMin);
        System.out.println("Segundos: "+ somaSeg);
        
        System.out.println("\nDiferença dos intervalos:");
        System.out.println("Horas: " + difH);
        System.out.println("Minutos: " + difMin);
        System.out.println("Segundos: " + difSeg);
                
        
        
        
        
        
        
    }
    
}
