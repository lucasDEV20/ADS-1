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
public class x1179 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int par[] = new int[5];
        int impar[] = new int[5];
        int p = 0;
        int im = 0;
        for (int i = 0; i < 15; i++) {
            int x = entrada.nextInt();
            if (x % 2 == 0) {
                par[p] = x;
                p++;
            } else {
                impar[im] = x;
                im++;
            }
            if (p == 5) {
                int c = 0;
                while (c < p) {
                    System.out.println("par[" + c + "] = " + par[c]);
                    c++;
                }
                p = 0;
            }
            if (im == 5) {
                int d = 0;
                while (d < im) {
                    System.out.println("impar[" + d + "] = " + impar[d]);
                    d++;
                }
                im = 0;
            }
            if (i == 14) {
                int d = 0;
                while (d < im) {
                    System.out.println("impar[" + d + "] = " + impar[d]);
                    d++;
                }
                int c = 0;
                while (c < p) {
                    System.out.println("par[" + c + "] = " + par[c]);
                    c++;
                }
            }
        }
    }
}