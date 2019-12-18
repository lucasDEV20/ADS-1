/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jopitionpane;
import javax.swing.JOptionPane;
public class JOptionpane3 {
    
    public static void main(String[] args) {
        String nome  = null ;
        int resposta  ;
        nome = JOptionPane.showInputDialog("qual o seu nome ?");
        resposta = JOptionPane.showConfirmDialog(null, "o seu nome e "+ nome + "?");
        if (resposta == JOptionPane.YES_OPTION) {
            //VERIFIQUE SE O USUARIO , CLICOU NA OPÇAOO CORRETA
        JOptionPane.showConfirmDialog(null, "seu nome e "+nome);
        } else {
        JOptionPane.showMessageDialog(null, "Seu nome não é " + nome);    
        }
    }
}
