/*

 */
package lista_N2;
import java.util.Scanner;
public class vetor_media {
    public static void main(String[] args) {
        double [] notas = new double [5];
        double soma = 0.0 , mediaTurma = 0.0 ;
        int i , cont = 0;
        Scanner entrada = new Scanner (System.in);
        for ( i = 0; i < notas.length; i++) {
            System.out.println("Digite a nota do aluno " +(i+1)+" : ");
            notas[i] = entrada.nextDouble();
            soma = soma + notas[i];
        }
        mediaTurma = soma/notas.length;
        for ( i = 0; i < notas.length; i++) {
            if (notas[i]>mediaTurma) {
                cont++;
                
            }
            System.out.println("media da turma "+mediaTurma);
            System.out.println("existem "+cont+" alunos com nota acima da media");
            
        }
    }
    
}
