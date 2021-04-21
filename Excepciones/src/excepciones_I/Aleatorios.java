/**
 *
 */
package excepciones_I;

import javax.swing.JOptionPane;

/**
 * @author sebastian
 *
 */
public class Aleatorios {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int elements = Integer.parseInt(JOptionPane.showInputDialog(""
                + "Introduce elementros de la matriz"));
        int[] numAleat = new int[elements];
        final int magicNumber = 100;

        for (int i = 0; i < numAleat.length; i++) {
            numAleat[i] = (int) (Math.random() * magicNumber);
        }

        for (int elem: numAleat) {
            System.out.println(elem);
        }
    }

}
