/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package prsticaalgopritmo;

import java.util.Scanner;

public class n3 {
    public static void main(String[] args) {
    Scanner CPF = new Scanner (System.in);
    String nome , endereço , cpf;
        System.out.println("digite seu nome completo ;");
        nome = CPF.nextLine();
        System.out.println("digite seu endereço completo ;");
        endereço = CPF.nextLine();
        System.out.println("digite seu CPF completo ;");
        cpf = CPF.nextLine();
        
        System.out.println("o usuario "+nome+"mora em "+endereço+"e seu cpf e "+cpf);
        
    }
}
