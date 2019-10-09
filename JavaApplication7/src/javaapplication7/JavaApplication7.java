/*
 *
 */
package javaapplication7;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class JavaApplication7 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double hora;
        JOptionPane.showMessageDialog(null, "hora da chamada");
        hora = Double.parseDouble(JOptionPane.showInputDialog("qual a hora da chamada "));
        JOptionPane.showMessageDialog(null, "a chamada sera feita em:"+hora);
    }

    // TODO code application logic here
}
