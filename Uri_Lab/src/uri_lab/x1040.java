/*

 */
package uri_lab;

import java.util.Scanner;
import java.text.DecimalFormat;

public class x1040 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0");
        //representaçao das variaveis
        double nota_1, nota_2, nota_3, nota_4;
        double media, prova;
        //Recolhendo dados do usuario , pedindo as notas
        nota_1 = entrada.nextDouble();
        nota_2 = entrada.nextDouble();
        nota_3 = entrada.nextDouble();
        nota_4 = entrada.nextDouble();
        //processamento das notas , e aplicando as condiçoes

        media = (nota_1 * 2 + nota_2 * 3 + nota_3 * 4 + nota_4 * 1) / 10;
        System.out.println("Media: " + df.format(media));
        //condiçoes 
        if (media >= 7) {
            System.out.println("Aluno aprovado.");
        } else if (media < 5) {
            System.out.println("Aluno reprovado.");
        } else {
            System.out.println("Aluno em exame.");
            prova = entrada.nextDouble();
            System.out.println("Nota do exame: " + df.format(prova));
            System.out.println("Aluno aprovado.");
            System.out.println("Media final: " + df.format((prova + media) / 2));
        }
    }

}
