import java.util.InputMismatchException;
import java.util.Scanner;

public class Evalua_edad {
    public static void main(String[] args) throws InputMismatchException {
        try {
	    	Scanner entrada = new Scanner(System.in);
	        System.out.println("Introduce tu edad, por favor");
	        int edad = entrada.nextInt();
	        if (edad >= 60) {
	            System.out.println("Eres adulto mayor");
	        } else if (edad >= 18 && edad < 60) {
	            System.out.println("Eres mayor de edad");
	        } else {
	            System.out.println("Eres menor de edad");
	        }
	        entrada.close();
        } catch (InputMismatchException e) {
			// TODO: handle exception
        	System.out.println("Qué carajos estás introduciendo?");
		}
        System.out.println("Hemos terminado");
    }
}
