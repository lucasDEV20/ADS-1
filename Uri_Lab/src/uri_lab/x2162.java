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
public class x2162 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int n = entrada.nextInt();
        int cndtn = 1;

        int[] medida = new int[n];
        for (int i = 0; i < n; i++) {
            medida[i] = entrada.nextInt();
        }
        if (n == 2 && medida[0] == medida[1]) {
            cndtn = 0;
        } else {
            for (int i = 2; i < n; i++) {
                if (medida[i] >= medida[i - 1] && medida[i - 1] >= medida[i - 2]) {
                    cndtn = 0;
                } else if (medida[i] <= medida[i - 1] && medida[i - 1] <= medida[i - 2]) {
                    cndtn = 0;
                }
            }
        }
        System.out.println((cndtn == 1) ? "1" : "0");
        entrada.close();
    }

}
