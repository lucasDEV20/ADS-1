/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package olamundo;

import java.awt.Dimension;
import java.awt.Toolkit;

public class resoluçao {
    
    public static void main(String[] args) {
      Toolkit tela;
      tela = Toolkit.getDefaultToolkit();
      Dimension detela = tela.getScreenSize();
      System.out.print("a resoluçao de tela desse computador e"+ detela.width);
      System.out.println(" X "+detela.height);
    
    }
}
