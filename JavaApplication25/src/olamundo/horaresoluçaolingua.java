/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package olamundo;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author Computador
 */
public class horaresoluçaolingua {
    public static void main(String[] args) {
        Date relogio = new Date();
        Locale loc = Locale.getDefault();
        System.out.println("-------DATA E HORA--------");    
       
        System.out.println("a hora do sistema e ");
        System.out.println(relogio.toString());
        System.out.println("----LINGUA DO COMPUTADOR---");
   
        System.out.println("a lingua do computador e ");
        System.out.println(loc.getDisplayLanguage()); 
        System.out.println("--------RESOLUÇAO----------");
        Toolkit tela;
        tela = Toolkit.getDefaultToolkit();
        Dimension detela = tela.getScreenSize();
        System.out.println("a resoluçao de tela desse computador e "+ detela.width+" X "+detela.height );

    }
  
}
