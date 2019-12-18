/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package laboratorio.uri;
import java.util.Scanner;
import java.text.DecimalFormat;


/**
 *
 * @author Computador
 */
public class X1012 {
    public static void main(String[] args) {
        
    
    Scanner entrada = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.000");
		double A, B, C, pi;
		double TRIANGULO, CIRCULO, TRAPEZIO, QUADRADO, RETANGULO;

		pi = 3.14159;
		A = entrada.nextDouble();
		B = entrada.nextDouble();
		C = entrada.nextDouble();

		TRIANGULO = A * C * 0.5;
		CIRCULO = pi * C * C;
		TRAPEZIO = (A + B) * C * 0.5;
		QUADRADO = B * B;
		RETANGULO = A * B;
		System.out.println("TRIANGULO: " + df.format(TRIANGULO));
		System.out.println("CIRCULO: " + df.format(CIRCULO));
		System.out.println("TRAPEZIO: " + df.format(TRAPEZIO));
		System.out.println("QUADRADO: " + df.format(QUADRADO));
		System.out.println("RETANGULO: " + df.format(RETANGULO));

}
}