/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package llc.lista4;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class LlcLista4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num = -1, lc;
        Scanner scanner = new Scanner(System.in);
        while(num < 0){
            System.out.println("Insira um número maior que 0");
            num = scanner.nextInt();
            if(num >= 0){
                lc = contdigitos(num);
                System.out.println("Número de dígitos: " + lc);
            }
        }
    }

    public static int contdigitos(int num) {
        int count = 0;
        if(num == 0){
            return 1;
        }
        while (num != 0){
            count ++;
            num /= 10;
        }
        return count;
    }
    
}
