/*
Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.

Entrada
A entrada contém um valor inteiro N (0 < N < 13).

Saída
A saída contém um valor inteiro, correspondente ao fatorial de N.
 */

package uri_lab;
import java.util.Scanner;
public class x1153 {
    public static void main(String[] args) {
        int N, fat = 1;
		Scanner input =new Scanner(System.in);
		N = input.nextInt();
		for (int i = 1; i <= N; i++) {
			fat *= i;
		}
		System.out.print(fat+"\n");

	}

}

    