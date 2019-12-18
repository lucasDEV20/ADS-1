/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package uri_lab;
import java.util.Scanner;
public class x1052 {
    public static void main(String[] args) {
    Scanner entrada = new Scanner (System.in);
     int num ;
     num = entrada.nextInt();
        if (num > 0 && num <= 12) {
            if (num == 1) {
                System.out.printf("January\n");
            }else if (num == 2){
                System.out.printf("February\n");
            }else if (num == 3){
                System.out.printf("March\n");
            }else if (num == 4){
                System.out.printf("April\n");
            }else if (num == 5){
                System.out.printf("May\n");
            }else if (num == 6){
                System.out.printf("June\n");
            }else if (num == 7){
                System.out.printf("July\n");
            }else if (num == 8){
                System.out.printf("August\n");
            }else if (num == 9){
                System.out.printf("September\n");
            }else if (num == 10){
                System.out.printf("Octuber\n");
            }else if (num == 11){
                System.out.printf("November\n");
            }else {
                System.out.printf("December\n");
            }
        }else{
            System.out.printf("MêS inválido");
        }
    }
}
