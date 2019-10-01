/*
 32. Leia a média de um aluno em certa disciplina e mostre o conceito obtido nessa
 disciplina. A tabela de conceitos é dada a seguir:

 NOTA CONCEITO
 0,0 – 4,9 D|
 5,0 – 6,9 C|
 7,0 – 8,9 B|
 9,0 – 10,0 A|
 */
package lista_1_n1;

import java.util.Scanner;

public class Exercicio_32 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        char D = 0, C = 0, B = 0, A = 0;
        float media, conceito;
        System.out.println();
        System.out.println("insiea a media do aluno :");
        media = entrada.nextFloat();
        if (0.0 <= D || 0.0 >= D || 4.9 <= D) {
            System.out.println("O concieto do aluno e igual a : D " +media );
            if (4.9 <= C) {
                System.out.println("O conceito do aluno e ifual a C :" + media);
            }
            
            if (5.0 <= C || 5.0 >= C || 6.9 <= C) {
                System.out.println("O conceito do aluno e ifual a  : C " + media );
                if (6.9 >= B) {
                    System.out.println("O conceito do aluno e ifual a B :" + media);                    
                }
                
                if (7.0 <= B || 7.0 >= B || 8.9 <= B) {
                    System.out.println("O conceito do aluno e ifual a  B :" + media);
                    if (8.9 >= A) {
                        System.out.println("O conceito do aluno e ifual a  A:" + media);
                    }
                    
                    if (9.0 <= A || 10.0 <= A) {
                        System.out.println("O conceito do aluno e ifual a  A:" + media);
                        
                    }
                }
            }
            
        }
    }
    
}
