package clasespropias;

public class HerenciaGenericos {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        /*Empleado administrativa = new Empleado("Elena", 45, 1500);
        Jefe directoraComercial = new Jefe("Ana", 27, 3500);
        Empleado nuevoEmpleado = directoraComercial;*/
        Pareja<Empleado> Administrativa = new Pareja<Empleado>();
        Pareja<Jefe> DirectoraComercial = new Pareja<Jefe>();
        //Pareja<Empleado> nuevoEmpleado = DirectoraComercial;
        Pareja.imprimirTrabajador(Administrativa);
        Pareja.imprimirTrabajador(DirectoraComercial);
    }

}
