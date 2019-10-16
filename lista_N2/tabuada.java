/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista_N2;
import java.util.Scanner;
public class tabuada {
    public static void main(String[] args) {
        int n , c ;
        for ( n = 1; n <= 10; n++) {
            System.out.println("----- tabuada bacana "+ n + "------");
            for ( c = 1; c < 10; c++) {
                System.out.printf("\n %d X %d = %d",n,c ,n * c);
            }
            System.out.println("\n");
        }
    }
}
