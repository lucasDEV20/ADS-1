import java.io.IOException;
import java.util.Scanner;
import java.text.DecimalFormat;
import static java.lang.Math.sqrt;

/* Leia 3 valores de ponto flutuante e efetue o cálculo das raízes da equação
de Bhaskara. Se não foi possível calcular as raízes, mostre a mensagem
correspondente “Impossivel calcular”, caso haja uma divisão por 0 ou raiz de
numero negativo.
Entrada
Leia três valores de ponto flutuante (double) A, B and C.
Saída Se não houver possibildade de calcular as raízes, apresente a mensagem
"Impossivel calcular". Caso contrário, imprima o resultado das raízes com 5
dígitos após o ponto, com uma mensagem correspondente conforme exemplo abaixo.
Imprima sempre o final de linha após cada mensagem. */
public class x1036.jaa {
    public static void main(String[] args) throws IOException {
 
		Scanner FORMULA = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00000");
		double A, B, C, R1, R2;
//Entrada
		A = FORMULA.nextDouble();
		B = FORMULA.nextDouble();
		C = FORMULA.nextDouble();
//PROCESAMENTO E SUAS CONDIÇOES 

		if ((A == 0) | (B*B - 4*A*C < 0)) {
			System.out.println("Impossivel calcular");
			//SE O VALOR DA RAIZ FOR INVALIDO (negativo)
		}
		else {
			R1 = (-B + Math.sqrt(B*B - 4*A*C))/(2*A);
			R2 = (-B - Math.sqrt(B*B - 4*A*C))/(2*A);
			
	//Saída E PRINT DOS valores		
			System.out.println("R1 = " + df.format(R1));
			System.out.println("R2 = " + df.format(R2));
		}
    }
}
