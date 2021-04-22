package arraylist;
import java.util.ArrayList;
import java.util.Iterator;

public class UsoEmpleado {
    /**
     * @param args
     */
    public static void main(String[] args) {

        /*Empleado[] listaEmpleados = new Empleado[3];

        listaEmpleados[0] = new Empleado("Maicol Pérez", 45, 2500);
        listaEmpleados[1] = new Empleado("Bairon Suárez", 55, 2000);
        listaEmpleados[2] = new Empleado("Yeimi Sánchez", 25, 2600);*/

        ArrayList<Empleado> listaEmpleados = new ArrayList<Empleado>();
        //listaEmpleados.ensureCapacity(11);
        listaEmpleados.add(new Empleado("Maicol Pérez", 45, 2500));
        listaEmpleados.add(new Empleado("Bairon Suárez", 55, 2000));
        listaEmpleados.add(new Empleado("Yeimi Sánchez", 25, 2600));
        listaEmpleados.add(new Empleado("Jesé Montoya", 23, 2800));
        listaEmpleados.add(new Empleado("Yeimi Sánchez", 25, 2600));
        listaEmpleados.add(new Empleado("Maicol Pérez", 45, 2500));
        listaEmpleados.add(new Empleado("Bairon Suárez", 55, 2000));
        listaEmpleados.add(new Empleado("Yeimi Sánchez", 25, 2600));
        listaEmpleados.add(new Empleado("Jesé Montoya", 23, 2800));
        listaEmpleados.add(new Empleado("Yeimi Sánchez", 25, 2600));
        listaEmpleados.add(new Empleado("Piter Pam", 25, 2600));
        listaEmpleados.add(new Empleado("Canpanita", 25, 2600));
        //listaEmpleados.trimToSize();
        //listaEmpleados.add(new Empleado("Olga", 25, 2600));
        //listaEmpleados.set(1, (new Empleado("Olga", 25, 2600)));
        //System.out.println(listaEmpleados.get(4).dameDatos());

        System.out.println(listaEmpleados.size());

        /*for (Empleado e: listaEmpleados) {
            System.out.println(e.dameDatos());
        }*/

        Iterator<Empleado> miIterador = listaEmpleados.iterator();
        while (miIterador.hasNext()) {
            System.out.println(miIterador.next().dameDatos());
        }

        /*for (int i = 0; i < listaEmpleados.size(); i++) {
            Empleado e = listaEmpleados.get(i);
            System.out.println(e.dameDatos());
        }*/
        /*Empleado arrayEmpleados[] = new Empleado[listaEmpleados.size()];
        listaEmpleados.toArray(arrayEmpleados);

        for (Empleado e: arrayEmpleados) {
            System.out.println(e.dameDatos());
        }*/
    }
}

class Empleado {
    public Empleado(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;

    }

    public String dameDatos() {
        return "El empleado se llama " + nombre + ". Tiene " + edad
                + " años. Y un salario de " + salario;
    }

    private String nombre;
    private int edad;
    private double salario;

}
