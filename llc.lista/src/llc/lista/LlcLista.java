/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package llc.lista;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class LlcLista {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner (System.in);
    float n1, n2, n3, rec;
        
        System.out.println("Insira a primeira nota: ");
        n1 = in.nextFloat();
        
        System.out.println("Insira a segunda nota: ");
        n2 = in.nextFloat();
        
        System.out.println("Insira a terceira nota: ");
        n3 = in.nextFloat();
        
        float media = (n1 + n2 + n3)/3;
        if (media<7) {
            System.out.println("O aluno foi reprovado.\nMédia:" + media);
            System.out.println("Digite a nota da recuperação:");
            rec = in.nextFloat();
            
            float li = (media+rec)/2;
            
            if (li > 5) {
                System.out.println("O aluno passou na recpar");
            }
            else if (li < 5) {
                System.out.println("O aluno foi reprovado na recpar");
            }
        }
        else if (media >= 7) {
            System.out.println("O aluno foi aprovado.\nMédia:" + media);
        }
    }
    
}
