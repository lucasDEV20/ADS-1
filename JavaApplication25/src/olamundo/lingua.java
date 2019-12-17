/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package olamundo;

import java.util.Locale;

/**
 *
 * @author Computador
 */
public class lingua {
    public static void main(String[] args) {
       Locale loc = Locale.getDefault();
        System.out.println("a lingua do computador e ");
        System.out.println(loc.getDisplayLanguage()); 
    }
  
}
