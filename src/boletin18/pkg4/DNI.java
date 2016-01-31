package boletin18.pkg4;

import javax.swing.JOptionPane;

/**
 *
 * @author Julián
 */
public class DNI {

    String[] letra = {"A", "B", "C", "D", "E", "F", "G", "H", "J", "K", "L", "M", "N", "P", "Q", "R", "S", "T", "V", "W", "X", "Y", "Z"};
    int[] num = {3, 11, 20, 9, 22, 7, 4, 18, 13, 21, 19, 5, 12, 8, 16, 1, 15, 0, 17, 2, 10, 6, 14};

    public int pedirDNI() {
        String res;
        int respuesta;
        do {
            res = (JOptionPane.showInputDialog("Introduzca el numero del DNI"));
            if (res.length() > 8) {
                JOptionPane.showMessageDialog(null, "El DNI no es valido");
            }
        } while (res.length() > 8);
        respuesta = Integer.parseInt(res);
        return respuesta;
    }

    public int calcularLetra() {
        int res = pedirDNI();
        int numDni = res % 23;
        return numDni;
    }

    public void visualizar() {
        int numDni = calcularLetra();
        for (int i = 0; i < letra.length; i++) {
            if (num[i] == numDni) {
                JOptionPane.showMessageDialog(null, "La letra de su DNI es: " + letra[i]);
            }

        }
    }
}
