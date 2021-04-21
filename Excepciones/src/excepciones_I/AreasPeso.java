package excepciones_I;

import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 * @author sebastian
 *
 */
public class AreasPeso {

    /**
     * Program thats return area and ideal weight.
     * @param args
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Elige una opción: \n1: Cuadrado "
                + "\n2: Rectángulo \n3: Triángulo \n4: Círculo");

        try {
            figura = entrada.nextInt();
            //entrada.close();
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error");
        } finally {
            entrada.close();
        }

        switch (figura) {
            case 1:
                int lado = Integer.parseInt(JOptionPane.showInputDialog(""
                        + "Introduce el lado"));
                System.out.println("El área del cuadrado es "
                        + Math.pow(lado, 2));
                break;

            case 2:
                int base = Integer.parseInt(JOptionPane.showInputDialog(""
                        + "Introduce la base"));
                int altura = Integer.parseInt(JOptionPane.showInputDialog(""
                        + "Introduce la altura"));
                System.out.println("El área del rectángulo es: "
                        + base * altura);
                break;

            case 3:
                base = Integer.parseInt(JOptionPane.showInputDialog(""
                        + "Introduce la base"));
                altura = Integer.parseInt(JOptionPane.showInputDialog(""
                        + "Introduce la altura"));
                System.out.println("El área del triángulo es: "
                        + (base * altura) / 2);
                break;

            case 4:
                int radio = Integer.parseInt(JOptionPane.showInputDialog(""
                        + "Introduce el radio"));
                System.out.print("El área del círculo es: ");
                System.out.printf("%1.2f", Math.PI * (Math.pow(radio, 2)));
                break;
            default:
                System.out.println("La opción no es correcta");
        }
        final int numberM = 110;
        final int numberW = 120;
        int altura = Integer.parseInt(JOptionPane.showInputDialog(""
                + "Introduce altura en cm"));
        System.out.println("Peso ideal hombre: "
                + (altura - numberM) + " kg");
        System.out.println("Peso ideal mujer: "
                + (altura - numberW) + " kg");
    }
    /**
     * Figure.
     */
    static int figura;
}

