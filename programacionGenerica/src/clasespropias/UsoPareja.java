package clasespropias;

public class UsoPareja {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Pareja<String> una = new Pareja<String>();
        una.setPrimero("Sebastián");
        System.out.println(una.getPrimero());

        Persona pers1 = new Persona("Ana");
        Pareja<Persona> otra = new Pareja<Persona>();
        otra.setPrimero(pers1);
        System.out.println(otra.getPrimero());
    }

}

class Persona {
    public Persona(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }

    private String nombre;
}
