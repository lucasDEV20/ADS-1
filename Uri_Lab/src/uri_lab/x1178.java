/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uri_lab;


import java.util.Scanner;

/**
 *
 * @author Computador
 */
public class x1178 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double n[] = new double[100];

        double x = entrada.nextDouble();

        n[0] = x;
        String formatX = String.format("%.4f", n[0]);

        System.out.println("N[" + (0) + "] = " + formatX);

        for (int i = 1; i < n.length; i++) {
            n[i] = n[i - 1] / 2;

            String format = String.format("%.4f", n[i]);

            System.out.println("N[" + (i) + "] = " + format);
        }

    }
}
