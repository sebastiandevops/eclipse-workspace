/**
 *
 */
package arraylist;

/**
 * @author sebastian
 *
 */
public class UsoArrayList {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        ArrayList2 archivos = new ArrayList2(4);

        archivos.add("Juan");
        archivos.add("María");
        archivos.add("Pedro");
        archivos.add("Sandra");

        String nombrePersona = (String) archivos.get(2);
        /*archivos.add(new File("test.txt"));
        File nombrePersona = (File) archivos.get(0);*/
        System.out.println(nombrePersona);
    }

}
