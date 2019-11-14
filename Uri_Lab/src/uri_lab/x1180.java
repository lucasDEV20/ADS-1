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
public class x1180 {

    public static void main(String[] args){

        int n,min = 0,tmpmMin = 0, position = 0;

        boolean checkFirst = false;

        Scanner entrada = new Scanner(System.in);

        n = entrada.nextInt();

        int array[] = new int[n];

        //take the value for array

        for (int i = 0; i < n; i++) {

            array[i] = entrada.nextInt();

        }



        for (int j = 0; j < n; j++) {

            tmpmMin = array[j];

            if (checkFirst == false) {

                min = tmpmMin;

                checkFirst = true;

            }

            if (tmpmMin < min) {

                min = tmpmMin;

                position = j;

            }

        }

        System.out.print("Menor valor: "+min+"\nPosicao: "+position+"\n");

    }
}