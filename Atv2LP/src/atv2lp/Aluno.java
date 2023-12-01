/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atv2lp;

import java.util.Scanner;

public class Aluno {
    private final int matricula;
    private final String nome;
    private final double nota1, nota2, trabalho;

    public Aluno(int matricula, String nome, double nota1, double nota2, double trabalho) {
        this.matricula = matricula;
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.trabalho = trabalho;
    }

    public double media() {
        double media = (nota1 * 2.5 + nota2 * 2.5 + trabalho * 2) / 7;
        return media;
    }

    public boolean aprovacao() {
        return media() >= 6.0;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Digite a matrícula do aluno: ");
            int matricula = sc.nextInt();
            
            System.out.print("Digite o nome do aluno: ");
            String nome = sc.next();
            
            System.out.print("Digite a primeira nota do aluno: ");
            double nota1 = sc.nextDouble();
            
            System.out.print("Digite a segunda nota do aluno: ");
            double nota2 = sc.nextDouble();
            
            System.out.print("Digite a nota do trabalho do aluno: ");
            double trabalho = sc.nextDouble();
            
            Aluno aluno = new Aluno(matricula, nome, nota1, nota2, trabalho);
            
            System.out.println("Média do aluno: " + aluno.media());
            
            if (aluno.aprovacao()) {
                System.out.println("Aluno aprovado!");
            } else {
                System.out.println("Aluno reprovado!");
            }
        }
    }
}
