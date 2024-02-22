/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package llc.lista2;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class LlcLista2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner (System.in);
        int quant;
        
            System.out.println("Insira a quantidade de livros:");
            quant = in.nextInt();
            
            double a = 7.50 + quant * 0.25;
            double b = 2.50 + quant * 0.50;
            
            if (a > b) {
                System.out.println("Opção A é a mais barata, você irá pagar: RS" + a);
            }
            else if (a < b) {
                System.out.println("Opção B é a mais barata, você irá pagar: RS" + b);
            }
    }
    
}
