package excepciones_I;

import javax.swing.JOptionPane;

/**
 * @author sebastian
 * Program for testing exceptions.
 */
public class VariasExcepciones {

    /**
     * Program that divides tow integers.
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        try {
            division();
        } catch (ArithmeticException e) {
            System.out.println("No se permite la división por 0.");
        } catch (NumberFormatException e) {
            System.out.println("No has introducido un entero.");
            System.out.println(e.getMessage());
            System.out.println("Tipo de error: " + e.getClass().getName());
        }
    }

    /**
     * Method to divide two integers.
     */
    static void division() {
        int num1;
        int num2;
        String msjDividendo = "Introduce dividendo";
        String msjDivisor = "Introduce divisor";
        num1 = Integer.parseInt(JOptionPane.showInputDialog(msjDividendo));
        num2 = Integer.parseInt(JOptionPane.showInputDialog(msjDivisor));
        System.out.println("El resultado es: " + num1 / num2);
    }

}
