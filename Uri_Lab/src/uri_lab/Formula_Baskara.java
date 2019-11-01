/*
 Formula de bascara , junto com a raiz 
 (ax)2 + bx c =0  
 - b +||-  raiz (b)2 - 4*a*c/a*a

 */
package lista_uri;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Formula_Baskara {

    public static void main(String[] args) {
        Scanner formula = new Scanner(System.in);

        double delta, x1, x2 = 0;
                int a, b, c;

        a = formula.nextInt();

        b = formula.nextInt();

        c = formula.nextInt();

        delta = (b*b)  + (-4 * (a * c));

        x1 = (-(b) + (Math.sqrt(delta)) / 2 * a);
        x1 = (-(b) - (Math.sqrt(delta)) / 2 * a);

        System.out.printf("o valor de x1 %5.f", x1);
        System.out.printf("o valor de x2 %5.f", x2);

        if (delta <= 0) {
            System.out.println("Impossivel calcular");
        }
    }

}
